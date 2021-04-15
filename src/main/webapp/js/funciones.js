
function validarDatos(){
    var num = document.forms["formulario"]["usuario"].valueOf();
    
    if (num){
        alert("Ingresar usuario");
    return false;
    }
    
}