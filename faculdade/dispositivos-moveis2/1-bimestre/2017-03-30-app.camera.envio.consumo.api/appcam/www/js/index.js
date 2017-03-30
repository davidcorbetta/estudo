//document.addEventListener('deviceready', this.onDeviceReady, false);


function tirarFoto(){
  var cameraOptions = {
    quality: 80,
    destinationType: 0,
    allowEdit:true,
    targetWidth: 800,
    targetHeight: 600
  }
  navigator.camera.getPicture(cameraSuccess, cameraError, cameraOptions);
}

function cameraSuccess(imageData){
  var foto = 'data:image/jpeg;base64,' + imageData;
  $.ajax({
    type: 'POST',
    url: 'https://api.fabiorogeriosj.com.br/foto',
    data: JSON.stringify({
      image: foto,
      title: 'teste corbetta'
    }),
    contentType: 'application/json',
    headers: {
      'X-Api-Key': 'Nx3WoYUq8a5hXd7tXnDrB2IeuVgiyuWm3QpqPnrc'
    },
    success: function(res){
      if(res.isValid){
        listaFotos();
      } else {
        alert(res.msg);
      }
    },
    error: function(xhr, type){
      alert('Ajax error!')
    }
  })
}

function cameraError(message){
  console.log('Error: ', message);
}

function getTimeStamp(now) {
    return ((now.getDate()) + '/' +
      (now.getMonth() + 1) + '/' +
             now.getFullYear() + " " +
             now.getHours() + ':' +
             ((now.getMinutes() < 10)
                 ? ("0" + now.getMinutes())
                 : (now.getMinutes())) + ':' +
             ((now.getSeconds() < 10)
                 ? ("0" + now.getSeconds())
                 : (now.getSeconds())));
}

function listaFotos(){
  $.ajax({
    type: 'GET',
    url: 'https://api.fabiorogeriosj.com.br/fotos',
    headers: {
      'X-Api-Key': 'Nx3WoYUq8a5hXd7tXnDrB2IeuVgiyuWm3QpqPnrc'
    },
    success: function(res){
      if(res.isValid){
        var lista = '';
        for(i in res.data.Items){
          var foto = res.data.Items[i];
         
          var time = new Date(foto.id);
          var vdata = getTimeStamp(time);

          lista += '<img src="'+foto.image+'"/>'+foto.title+' - '+vdata+'<br><br>';
        }
        document.getElementById('lista').innerHTML = lista;
      }
    },
    error: function(xhr, type){
      alert('Ajax error!')
    }
  })
}

listaFotos();
