/* por ahora creamos documento para probar cada una de las funciones */

/* se importan las funciones */
const { palindrome } = require('../probar2')

test('palindrome de generation', () => {
    const resultado = palindrome('generation')

    /* se hace comparacion */
    expect(resultado).toBe('noitareneg')
})

test('palindrome usando un string vacio', () => {
    const resultado = palindrome('')

    /* se hace comparacion */
    expect(resultado).toBe('')
})


test('palindrome usando un string vacio undefined', () => {
    const resultado = palindrome()

    /* se hace comparacion */
    expect(resultado).toBe()
})