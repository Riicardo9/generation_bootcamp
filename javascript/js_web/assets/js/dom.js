console.log(window.document);
console.log(document);
console.log(document.head);
console.log(document.body);
console.log(document.documentElement); /* Trae todo el html */
console.log(document.doctype);
console.log(document.charset);
console.log(document.links);
console.log(document.images);
console.log(document.styleSheets);
console.log(document.scripts);


/* muestra en consola el texto que selecciona al usuario en la pagina */
setTimeout(()=> {
    console.log(document.getSelection().toString());
}, 3000);


/* Inserta texto MALA PRACTICA USAR EN PRODUCCION */
document.write('Texto desde document write');
document.write('<h2>Texto desde document write</h2>');


