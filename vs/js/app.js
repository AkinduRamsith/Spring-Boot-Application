
let studentTable = document.getElementById("tbl-student");

/*fetch("http://localhost:8080/student")
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
    })*/

    var myHeaders = new Headers();
    myHeaders.append("Content-Type", "application/json");
    
    var raw = JSON.stringify({
      "firstName": "Akindu",
      "lastName": "ICET"
    });
    
    var requestOptions = {
      method: 'POST',
      headers: myHeaders,
      body: raw,
      redirect: 'follow'
    };
    
    fetch("http://localhost:8080/student", requestOptions)
      .then(response => response.text())
      .then(result => console.log(result))
      .catch(error => console.log('error', error));


