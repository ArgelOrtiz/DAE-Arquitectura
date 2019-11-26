var carrito = [];

$( document ).ready(function() {
    $(".agregar").click(function(){
        
        var id = $(this).siblings(".idTablaP").val();
        var nombre = $(this).siblings(".idNameP").val();
        var cantidad = $(this).siblings(".unidades").val();
        
        alert(id + " - " + cantidad);
        
        var compra = [
            {
            id: id,
            nombre: nombre,
            cantidad: cantidad
            }
        ];
        
        carrito.push(compra);
        localStorage.setItem('carrito', carrito);
        
        swal("El producto se ha añadido a tu carrito!", {
            buttons: false,
            timer: 1300,
        });
    });
    
    var productos = "";
    $('#showModal').click(function(){
        $('#exampleModal').modal('show');
            
        carrito.forEach(function(item){
            var cont = 0;
            productos += "<tr>";
            productos += "<th>"+item[cont]["id"]+"</th><th>"+item[cont]["nombre"]+"</th><th>"+item[cont]["cantidad"]+"</th>";
            productos += "</tr>";
            cont ++;
        });
        
        $('#exampleModal .modal-body table').remove();
        $('#exampleModal .modal-body').append('<table class="table table-striped table-dark">'
        +'<thead>'
        +'<tr>'
        +'<th>Id</th>'
        +'<th>Nombre</th>'
        +'<th>Cantidad</th>'
        +'</tr>'
        +'</thead>'
        +productos
        +'</table');
        
        productos = "";
    });
});
