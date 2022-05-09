const suma = (a,b) => {
return a-b;
}

console.log(suma(1,3)===4)
console.log(suma(0,0)===0)
console.log(suma(5,5)===10)


/* assert primero pide la afirmacion y despues lo que saldra si no sucede la afirmacion */
console.assert(
    suma(1,3)===4,
    'EL resultado de la suma 1 y 3 deberia ser 4')



const arr =[
{a:1, B:3, resultado:4},
{a:0, B:0, resultado:0},
{a:5, B:5, resultado:10},
{a:10, B:30, resultado:40},
]

arr.forEach(prueba => {
    const {a, b, resultado} = prueba;
    console.assert(suma(a,b)===resultado, `suma de ${a} y ${b} deberia ser ${resultado}`)
})

/* mocha framework para pruebas unitarias, jasmine recomendado para angular, la mejor opcion jest (sugerido para react, aunqye tambien sierve par aangular, vanilla, ) */