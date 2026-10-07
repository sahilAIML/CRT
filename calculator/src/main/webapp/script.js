function calculate(event) {

    // Prevent the image button from submitting/reloading the page
    event.preventDefault();

    // Get input values
    let input1 = Number(
        document.getElementById("input1").value
    );

    let input2 = Number(
        document.getElementById("input2").value
    );

    // Get selected operation
    let operation =
        document.getElementById("operation").value;

    let result;

    // Check inputs
    if (
        document.getElementById("input1").value === "" ||
        document.getElementById("input2").value === ""
    ) {
        alert("Please enter Input1 and Input2");
        return;
    }

    // Perform calculation
    switch (operation) {

        case "ADD":
            result = input1 + input2;
            break;

        case "SUBTRACT":
            result = input1 - input2;
            break;

        case "MULTIPLY":
            result = input1 * input2;
            break;

        case "DIVIDE":

            if (input2 === 0) {
                alert("Cannot divide by zero");
                return;
            }

            result = input1 / input2;
            break;

        default:
            alert("Please select an operation");
            return;
    }

    // Display result
    document.getElementById("result").value = result;
}


function resetCalculator(event) {

    // Prevent page reload
    event.preventDefault();

    // Clear Input1
    document.getElementById("input1").value = "";

    // Clear Input2
    document.getElementById("input2").value = "";

    // Reset operation
    document.getElementById("operation").value = "Select";

    // Clear result
    document.getElementById("result").value = "";
}