const { average } = require('../probar2')


/* permite agregar varios metodos  a testear */
describe('average', () => {

    /* test('ingresar un solo valor', () => {
        const resultado = average([1])
        expect(resultado).toBe(1)
    }) */

    /* lo mismo pero menos codigo */
    test('ingresar un solo valor', () => {
        expect(average([1])).toBe(1)
    })

    test('ingresar un solo valor', () => {
        expect(average([1,2,3,4,5,6])).toBe(3.5)
     })


    /* crear test oara probar valor undefined */
    test('usando un indefinido', () => {
        expect(average()).toBeUndefined()
     })

     test('usando un arreglo vacio', () => {
        expect(average([])).toStrictEqual([])
     })

})