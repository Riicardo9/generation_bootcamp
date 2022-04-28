const Ricardo = {
    nombreCompleto: {nombre:"Ricardo", apellido:"Ortega"},
    edad:"27",
    pasatiempos: ['familia', 'musica','desarrollo'], 
}

const angel = {

	nombreCompleto: {
	nombre:"Angel",
	apellido: "Lopez"
	},
	edad : 23,
	pasatiempos: ["cine", "correr", "dibujar"]
}


const Alexander = {
    nombreCompleto: {
        nombre: "Alexander tovar",
        apellido: "martinez"
    },
    edad: 24,
    pasatiempos: ["descanzar","dibujar","plantas"]
}

const santiago = {
    nombreCompleto: {
        nombre:"carlos",
    apellido:"cruz",
    },
    edad: 29,
    pasatiempos: ["futbol", "estudiar", "anime"],    
    }

    const nuevaPersona = {
        nombreCompleto: {
            nombre: "Daniel",
            apellido: "Perez",
        },
        edad: 24,
        pasatiempos: ["fotografia", "peliculas", "leer"],
    }
    



/* Se hace un arreglo lleno de objetos */
const cohorte12 = [Ricardo, angel, Alexander,santiago,nuevaPersona]
console.log(cohorte12) /* imprime arreglo de objetos (JSON) */

for (let i=0 ; i<cohorte12.length; i++){
    console.log(cohorte12[i]) /* imprime todos los objetos */
    console.log(cohorte12[i].edad) /* imprime solo las edades */
    if(cohorte12[i].pasatiempos.includes("leer")){ /* metodo includes revisa si existe el valor en el atributo especifico del objeto*/
        console.log(cohorte12[i].nombreCompleto.nombre) /* al cumplir la revision, busca e imprime el bombre de los objetos incluidos */
    }; 
    
}
