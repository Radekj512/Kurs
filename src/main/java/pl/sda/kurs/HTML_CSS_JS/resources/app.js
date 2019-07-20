$(document).ready(function () {
    const key = "gMABSLcnSGoDRZvgGnAe";
    getNotes();
    let flag = 0;


    $('form').submit(function (event) {

        let title = $('#validationCustom01').val();
        let content = $('#validationCustom02').val();
        createNote(title, content);
        event.preventDefault();
    });

        $(document).on('click',".button_delete", function(){
            let id = $(this).attr("note_id");
            deleteNote(id);

        });
        $(document).on('click', '.button_modify', function(){
            let id = $(this).attr("note_id");
            modifyNote(id);
        });


        $(document).on('click', '#cancel_button', function(){
            location.reload();
        })



    const createNote = (title, content) => {
        const data = {
            title: title,
            content: content
        };
        addNote(title, content);
        $.ajax({
            url: "http://178.62.193.183:8080/notes",
            headers: {
                "Content-Type": "application/json",
                "Accept": "*/*",
                "creator-name": key
            },
            data: JSON.stringify(data),
            type: "POST"
        });
    };

    function getNotes() {
        $.ajax({
            url: "http://178.62.193.183:8080/notes",
            headers: {
                "Accept": "*/*",
                "creator-name": key
            },
            type: "GET",
            success: function (data) {
                for (let i = 0; i < data.length; i++) {
                    addNote(data[i].title, data[i].content, data[i].id);
                }

            }
        });
    }
    function deleteNote(noteId) {
        $.ajax({
            url: "http://178.62.193.183:8080/notes/" + noteId,
            headers: {
                "Accept": "*/*",
                "creator-name": key
            },
            type: "DELETE",
            success:function(){
                alert("Usunięto notatkę");
                location.reload();
            }
        });
    }

    function modifyNote(noteId) {
        $('#lab').html("Zmień notatkę");
        $('#submit_button').html("Zmień");
        $('#cancel_button').show();
        $('#validationCustom01').val();
        console.log($('#note_title').val());


    }
    function getById(noteId) {
        $("#"+noteId).on("event", function () {
            let title = $(this).attr("note_title");
            console.log(title);
        });
    }

    function updateNote(noteId){}

    function addNote(title, content, id) {
        let divClass = "row note";
        if(flag === 0){
            divClass = "row note2";
            flag = 1;
        }else{
            divClass = "row note";
            flag = 0;
        }
        $('#notes-list').append("<div class=\""+divClass+"\" id='"+id+"'>\n" +
            "<div class=\"col-3\" note_title = \""+id+"\">" + title + "</div>" +
            "<div class=\"col-7\" note_context = \""+id+"\">" + content + "</div>" +
            "<div class=\"col-1\"><img src=\"modify.png\" class = \"button_modify\" note_id = \""+id+"\" ></div>" +
            "<div class=\"col-1\"><img src=\"delete.png\" class = \"button_delete\" note_id = \""+id+"\" ></div>" +
            "</div>");
    }
});

