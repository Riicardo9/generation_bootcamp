const $form = document.querySelector('form')

$form.addEventListener('submit', (e) =>{
    e.preventDefault();
    const busqueda = document.querySelector('input').value;
    console.log(busqueda)

    /* se envia dato de busqueda al index */
   /*  se coloca en el link web la informacion del input, con ? se indica que se trata de informacion*/
    window.location.href = `busqueda.html?nombre=${busqueda}`

})