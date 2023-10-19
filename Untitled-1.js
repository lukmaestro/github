
    let number1 = document.getElementById('number1')
    let number2 = document.getElementById('number2')
    let button = document.getElementById('button')
    button.onclick = sum
function sum() {
    const result = parseInt(number1.value) + parseInt(number2.value)
    document.getElementById("result").innerHTML = result
    document.write(result)
}