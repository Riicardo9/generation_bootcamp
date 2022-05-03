const url = "https://dog.ceo/api/breeds/list/all" //Link para trabajar con listas
const lista = document.querySelector("ul") //Se selecciona el elemento padre

fetch(url).then(respuesta => respuesta.json().then(datos => {
    /* console.log(datos.message.terrier) */

    const arrTiposRaza = datos.message.terrier
    /* console.log(arrTiposRaza) */

    /* se recorre uno a uno y se imprime */
    arrTiposRaza.forEach(tipoRaza => {
        /* console.log(tipoRaza) */
        
        /* en cada recorrido se pinta un elemento de lista segun la iteracion */
        const template =  `<li class="list-group-item">${tipoRaza}</li>`

        /* para anidar y no sobreescribir */
        lista.innerHTML += template
    })
}))
