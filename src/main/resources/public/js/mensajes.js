$("#guardar-mensaje").click(function(){
$.ajax('http://localhost:9000/api/mensaje',{
data:{
titulo:$("#titulo").val(),
cuerpo:$("#cuerpo").val()
}
}
});