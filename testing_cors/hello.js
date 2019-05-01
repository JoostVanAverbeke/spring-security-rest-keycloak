$(document).ready(function() {
  $.ajax({
    url: "http://localhost:9002/guest/hello"
  }).then(function(data, status, jqxhr) {
    $('.greeting-id').append(data.id);
    $('.greeting-content').append(data.content);
    console.log(jqxhr);
  });
});
