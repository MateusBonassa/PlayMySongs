function valida(){
  
  var img = document.getElementById('imagem');
  var nome = document.getElementById('nome');
  var cantor = document.getElementById('cantor');
  var genero = document.getElementById('genero');
  var musica = document.getElementById('musica');

 
  var imgex = /(.jpg|.jpeg|.png)$/i;
  var musicaex = /(.mp3)$/i;
  var  valido = /^[a-zA-Z-0-9_ ]+$/;

  var imgnome = img.value;
  var musicanome = musica.value;

  
  
  if(nome.value.match(valido) && cantor.value.match(valido) && genero.value.match(valido)){
    if(!imgex.exec(imgnome) || !musicaex.exec(musicanome)){
      if(!imgex.exec(imgnome))
          alert("Extenção da imagem não permitida! Use: jpg, jpeg ou png!");
      else
         alert("Extenção da música não permitida! Use: mp3!");

    }else{
      if(img.files[0].size > 51200000  || musica.files[0].size > 51200000){
        if(img.files[0].size > 51200000){
          alert("Tamanho da imagem é muito grande! Insira uma imagem até 50mb");
        }else{
          alert("Tamaho da música é muito grande! Insera uma imagem até 50mb");
        }
      }else{
          alert("Sucesso!");
        }
    }
  }else{
      alert("Não são permitidos caracteres especiais");
    }
}




