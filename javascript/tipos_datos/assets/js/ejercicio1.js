/* pedir con prompt el año en que nacio y regresar la edad de la persona */
/* pedir con un input y boton*/
/* adicional dia mes y año para saber si ya cumplio o no los años */


/* const formul = document.querySelector("#formulNac") 
formul.addEventListener('submit', function(e){
    e.preventDefault()
    let fechNac = new Date();

    var fechNac = document.getElementById("fechaNacimiento").value;
    console.log(fechNac)
    
}) */


let calculo = new FormData(formulNac)
console.log(calculo.get("fechaNacimiento"))



