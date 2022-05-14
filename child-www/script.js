console.log("child script");

function reqListener() {
    console.log(this.responseText);
}

var oReq = new XMLHttpRequest();
oReq.addEventListener("load", reqListener);
oReq.open("GET", "http://localhost:20002/employees");
oReq.send();
