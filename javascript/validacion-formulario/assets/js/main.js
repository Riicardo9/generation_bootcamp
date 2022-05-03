// se usan las diagonales /.../ para indicarle que son expresiones regulares
const expresiones = {
	usuario: /^[a-zA-Z0-9\_\-]{4,16}$/, // Letras, numeros, guion y guion_bajo
	nombre: /^[a-zA-ZÀ-ÿ\s]{1,40}$/, // Letras y espacios, pueden llevar acentos.
	password: /^.{4,12}$/, // 4 a 12 digitos.
	email: /^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$/,
	telefono: /^\d{7,14}$/ // 7 a 14 numeros.
}

const formulario = document.querySelector('form');
//console.log(formulario)

const inputs = document.querySelectorAll('input') //Selecciona todos los elementos tipo inputs, sin All trae solo el 1er input que encuentre
//console.log(inputs)

const nombreError = document.querySelector("#errorNombre") //# para indicar buqueda por id (con getelementbyid no es necesario)
const apellidoError = document.querySelector("#errorApellido")
const emailError = document.querySelector("#errorEmail")
const passwordError = document.querySelector("#errorPassword")
const telefonoError = document.querySelector("#errorTelefono")
console.log(nombreError,apellidoError,emailError,passwordError,telefonoError)

// Se definen valores iniciales falsos
const statusInf = {
	nombre: false,
	apellido: false,
	email: false,
	password: false,
	telefono: false
}

inputs.forEach((inp) => { //recorre cada elemento de tipo input, tambien se puede hacer por separado pero es mas rapido con un foreach
	//console.log(inp)
	inp.addEventListener('keyup', (e) => {
		console.log(e.target.name) /* se imprime el nombre del campo en particular al que se le ingreso algo */

		switch(e.target.name){ /* dependiendo del nombre del campo ejecuta instrucciones espcificas */
			case 'nombre':
				console.log(e.target.value); //se imprime el valor de lo que el usuario introduce en el campo especifico
				console.log(expresiones.nombre.test(e.target.value)); /* se manda a llamar el objeto que tiene la expresion regular y se usa para probar el valor del usuario ()*/
				if (expresiones.nombre.test(e.target.value)){
					statusInf.nombre = true;
					nombreError.textContent = "";
				} else {
					statusInf.apellido = false;		
					nombreError.textContent = "Error";
				}
				break
			case 'apellido':
				if (expresiones.nombre.test(e.target.value)){
					statusInf.apellido = true;
					apellidoError.textContent = "";
				} else {
					statusInf.apellido = false;
					apellidoError.textContent = "Error";
				}
				break
			case 'email':
				if (expresiones.email.test(e.target.value)){ //hace test con el objeto email y seguir cambiando
					statusInf.email = true;
					emailError.textContent = "";
				} else {
					statusInf.email=false;
					emailError.textContent="Error";
				}
				break
			case 'password':
				if (expresiones.password.test(e.target.value)){
					statusInf.password = true;
					passwordError.textContent = "";
				} else {
					statusInf.password = false;
					passwordError.textContent = "Error";
				}
				break
			case 'telefono':
				if(expresiones.telefono.test(e.target.value)){
					statusInf.telefono = true;
					telefonoError.textContent = "";
				} else {
					statusInf.telefono = false;
					telefonoError.textContent = "Error";
				}
				break
		}
	})
})

/* //Tambien se puede obtener cada elemento uno a uno del input, pasandolos como parametos de la funcion flecha
// en este caso vamos a imprimir en funcion de keyup como en la funcion de arriba (revisar bloque de instruccion inputs.forEach((inp,)
inputs.forEach((inp,i,inputsCompleto)=>{ //recorre todos los slementos de input e imprime contenido
	console.log(inp)
	console.log(inp.i)
	console.log(inputsCompleto)
}) */

formulario.addEventListener('submit', (e) => {
	e.preventDefault();
	//console.log(Object.values(statusInf)) //imprime el valor de cada elemento (nom, apell, email ...) del objeto statusInf
	//console.log(Object.values(statusInf).includes(false)) // solicita los elementos del objeto con false
	const check = document.querySelector('#terminos').checked //Se pide el estado de el ckeck de terminos y condiciones
	if (!Object.values(statusInf).includes(false) && check == true){
		//console.log('Enviado');
		document.querySelector(".alert-danger").style.display = "none" //se quita el despliegue del la etiqueta en lugar de console.log
		const datos = Object.fromEntries(
			new FormData(e.target)
		)
		console.log(datos)
	} else {
		//console.log('No enviado');
		document.querySelector(".alert-danger").style.display = "block" //se muestra el alerta de error en lugar de console.log
	}
})