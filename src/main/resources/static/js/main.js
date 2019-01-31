$(document).ready(function(){
  $('#user').click(function(){
    $('.header .login div').toggle();
  });
  $('#cadastrar').click(function(){
    $('#alert').show();
    setTimeout(function() {
      $('#alert').fadeOut('fast');}, 900);
      window.location.href = "home.html"
  });
 
});