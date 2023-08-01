function showTable() {
  $("#food-table tbody").empty();
  let urlPath = "http://localhost:8080/food";
  $.getJSON(urlPath, function (response) {
    let tr = [];
    tr.push("<tbody>");
    for (var i = 0; i < response.length; i++) {
      tr.push("<tr>");
      tr.push("<td>" + response[i].id + "</td>");
      tr.push("<td>" + response[i].name + "</td>");
      /*
        tr.push(
          "<td><a href=" + response[i].id + "><button>Edit</button></a></td>"
        );
        */
      tr.push("</tr>");
    }
    tr.push("</tbody>");
    $("#food-table tbody").append($(tr.join("")));
  });
}

$(document).ready(function () {
  showTable();

  $("#food-form").on("submit", function () {
    $.ajax({
      type: "POST",
      contentType: "application/json; charset=utf-8",
      url: "http://localhost:8080/food/save",
      data: JSON.stringify({
        name: $("#food-name").val(),
      }),
      cache: false,
      success: function (result) {
        alert("Saved!");
        $("#save-status").html("<p>Success!</p>");
        setTimeout(function () {
          $("#save-status").html("");
        }, 1000);
      },
    });
  });
});
