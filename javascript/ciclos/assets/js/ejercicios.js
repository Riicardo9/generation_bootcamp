/* escribe un ciclo anidado que imprima el siguiente patrón.
 *  
 * *  
 * * *  
 * * * *  
 * * * * *
 */

for(let i=1; i<=5; i++){
    for(let j=1; j<=i; j++){
        document.write('*');
        console.log('*')
    }
    document.write('<br>')
    console.log('\n')
}



/* Ejercicio 1
Escribe un loop que haga lo siguiente:
Repetidamente imprime el valor de la variable xValue, disminuyendo por 0.5 su valor cada iteración.
El ciclo se mantendrá mientras que el valor de xValue sea positivo.

Ejercicio 2
Imprime todos los números impares entre 1 y 100

Ejercicio 3
Escribe un ciclo while que imprima de 1 a n dentro de corchetes cuadrados
Por ejemplo: si n = 6 imprime [1] [2] [3] [4] [5] [6]

Ejercicio 4
Escribe un ciclo que calcule la suma de los numeros positivos entre 1 y n
ejemplo: n = 5 sum = 15     
por que (1 + 2 + 3 + 4 +5 )
 */

const e1 = (xValue) => {
    if (xValue < 0){ 
        return console.log('Ingresa un positivo')
    } else{
        while(xValue>0){
            xValue-=0.5;
            console.log(xValue)
        }
    }
}
e1(9);


const e2 = () =>{
    for (let i = 1; i <= 100; i++) {
        if (i%2 === 1) {
          console.log(i);
        }
      }
}
e2()


const ejercicio3 = (n) => {
    let i = 1;
    let str = [];
    while (i <= n) {
      str += `[${i}] `
      i++;
    }
    console.log(str);
  }
  ejercicio3(10)
  

const e4 = (n)=>{
    let suma=0;
    for(let i4=0; i4<=n; i4++){
        suma+=i4;
    }
    console.log(suma)
}
e4(3)

/* intento de mostrar los numero que fueron sumados del ejercicio 4 */
let numIn = new Number(prompt("Ingrese un número"));

for (numIn ; numIn>0 ; numIn--) {
    document.write("<hr>" + numIn + "<hr>");
    for (let i = 0; i<=numIn; i++) {
        let arrayIn = new Array();
        arrayIn.push(i);
        document.write(arrayIn + "<br>");
    }
}



