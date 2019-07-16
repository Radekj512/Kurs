$(document).ready(function () {
    const key = "gMABSLcnSGoDRZvgGnAe";
    console.log(key);
    var flag = 0;

    $('form').submit(function (event) {

        let name = $('#validationCustom01').val();
        let lastName = $('#validationCustom02').val();
        let city = $('#validationCustom03').val();
        let nick = $('#validationCustomUsername').val();
        addUser(name, lastName, nick, city);
        // createPerson(name, lastName, nick, city)
        console.log(name, lastName, city, nick);
        event.preventDefault();
    });

    function addUser(name, lastName, nickName, city) {
        if (flag === 0) {
            $('#notes-list').append("<div class=\"row note\">\n" +
                "                <div class=\"col-3\">" + name + "</div>\n" +
                "                <div class=\"col-3\">" + lastName + "</div>\n" +
                "                <div class=\"col-3\">" + nickName + "</div>\n" +
                "                <div class=\"col-3\">" + city + "</div>\n" +
                "            </div>");
            flag = 1;
        } else {
            $('#notes-list').append("<div class=\"row note2\">\n" +
                "                <div class=\"col-3\">" + name + "</div>\n" +
                "                <div class=\"col-3\">" + lastName + "</div>\n" +
                "                <div class=\"col-3\">" + nickName + "</div>\n" +
                "                <div class=\"col-3\">" + city + "</div>\n" +
                "            </div>");
            flag = 0;
        }

    }


});
