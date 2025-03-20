// Call the dataTables jQuery plugin
$(document).ready(function() {
  $('#users').DataTable();
});

async function cargarUsuarios() {
      const request = await fetch('/users/0', {
        method: 'GET',
        headers: {
          'Accept': 'application/json',
          'Content-Type': 'application/json'
        },
      });
      const users = await request.json();

      console.log(users);

}
