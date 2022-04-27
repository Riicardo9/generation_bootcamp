
const color= document.querySelector("#inputcolor")
console.log(color)
color.addEventListener("change",function(e){
   document.body.style.backgroundColor=e.target.value;
})



const formulario = document.querySelector("#formularioDatos") /* Selecciona el formulario */
console.log(formulario)

formulario.addEventListener("submit", function(e){
    e.preventDefault() /* hace que se detenga hasta que reciba los datos */
    const datos = Object.fromEntries(
        new FormData(e.target)
    )
    console.log(datos)

})