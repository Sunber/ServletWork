window.onload = () => {
	populateTodosTable();
}

const populateTodosTable = () => {
	const xhr = new XMLHttpRequest();
	
	xhr.onreadystatechange = () => {
		if (xhr.status === 200 && xhr.readyState === 4) {
			let todos = JSON.parse(xhr.responseText);
			addTodosToTable(todos);
		}
	}
	
	xhr.open("GET", "http://localhost:8080/ServletShowcase/reimbursements.do");
	xhr.send();
}

function addTodosToTable(todos) {
	for (let todo of todos) {
		let reqId = document.createElement("td");
		let workId = document.createElement("td");
		let requestSum = document.createElement("td");
		
		console.log(todo);
		
		reqId.textContent = todo.id;
		workId.textContent = todo.title;
		requestSum.textContent = todo.description;
		
		let row = document.createElement("tr");
		
		row.appendChild(reqId);
		row.appendChild(workId);
		row.appendChild(requestSum);
		
		document.getElementById("reqBody").appendChild(row);
	}
}