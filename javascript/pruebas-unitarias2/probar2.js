/* const palindrome = (string) => {
    if(typeof string === 'undefined') return ;

    return string
            .split('')
            .reverse()
            .join('');
} */

const { json } = require("stream/consumers");



const palindrome = (string) => {
    if(typeof string == 'undefined') return;  // si se agrega validacion el test ya pasa la parte de undefined
    return string
            .split('')
            .reverse()
            .join('');
}


const average = array => {
    if(typeof array === 'undefined') return;
    if(array.length === 0) return [];

    let sum = 0;
    array.forEach(num => { sum += num });
    return sum / array.length;
}


/* para que pueda ser usado por otro archivo js, este disponible colocar lo que se ocupara */
/* si dentro del objeto la llave y el valor son lo mismo se puede omitir */
module.exports = {
    palindrome : palindrome,
    average : average
}


/* otra forma de exportar uno por uno */
/* module.exports = palindrome;
module.exports = average; */