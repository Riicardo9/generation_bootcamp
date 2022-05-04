let tiempo = 3000

setTimeout(()=>{console.log('ejecutado despues de 3 segundos')}, 3000)
console.log('hola')

setTimeout(()=>{
    let datos ="Ricardo"
    console.log(datos)
}, tiempo)
//console.log(datos)
console.log("Hola")



const datos = [
    {
        nombre: "Ricardo",
        edad: 27
    }, 
    {
        nombre: "Ortega",
        edad: 28
    },  
    {
        nombre: "Eusebio",
        edad: 29
    }
]


/* sincrono */
function obtenerDatos(){
    console.log(datos)
}
obtenerDatos()


/* asincrono da undefined */
function obtenerDatoss(){
    setTimeout(()=>{
        return datos
    })
}
console.log(obtenerDatoss())


/* para resolver el error se trabaja con promesas */
function obtenerDatosss(){
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            resolve(datos) 
        },3000)
    })
}

/* se espera a que la promesa se cumpla y ejecuta (then) */
obtenerDatosss().then((datos)=>{
    console.log(datos)
})


/* otra forma de esperar, la funcion internamente espera, se requiere llamar a la funcion */
async function obtenerDatosAsync(){
    const datosObtenidos  = await obtenerDatosss()
    console.log(datosObtenidos)
}
obtenerDatosAsync()


