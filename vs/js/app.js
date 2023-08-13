
let studentTable = document.getElementById("tbl-student");

fetch("http://localhost:8080/student")
    .then(response => response.json())
    .then(res => {
        let tblBody = `<tr>
                    <td>Student Fisrt Name</td>
                    <td>Student Last Name</td>
                </tr>`  

        res.forEach(element => {
            tblBody += `<tr>
                <td>${element.firstName}</td>
                <td>${element.lastName}</td>
            </tr>`;
        });
        studentTable.innerHTML = tblBody;
    })