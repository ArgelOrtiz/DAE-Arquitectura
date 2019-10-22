# DAE-Arquitectura
Proyecto	Final

Desarrollo	de	Aplicaciones	Empresariales
Profesor: Ing. Jorge Mendoza Zapata
Objetivo: Hacer una aplicación WEB que permita gestionar un listado de productos y hacer ventas
de dichos productos mediante una aplicación empresarial en Java, con arquitectura MVC, usando
JSP y montar la aplicación en un servidor de prueba con SSL.
Descripción: Hacer una aplicación WEB para gestionar un catálogo de artículos y ventas
considerando la gestión de artículos, usuarios, clientes, ventas, seguridad con encriptación y uso de
SSL, manejo de sesiones y uso de servicios web.
El usuario deberá iniciar sesión antes de poder usar la aplicación y debdebe haber diferentes perfiles
de usuario con diferentes privilegios (clientes y administradores), se debe poder agregar más de un
producto en una misma compra
Hacer una aplicación WEB que permita gestionar las entradas y salidas de almacén de una
organización controlando productos, clientes y usuarios.
Requerimientos:
1. Hacer un formulario de registro de clientes para que se den de alta en la aplicación
2. Hacer una pantalla de logeo donde se valide el tipo de usuario (clientes y administradores)
y mostrar solamente la funcionalidad de acuerdo al usuario que inició sesión.
3. Incluir la interfáz gráfica para que los clientes que ya se han logeado, puedan buscar y
agregar al carrito de compras los artículos que desa adquirir y luego procesar la compra de
los productos del carrito.
4. Los clientes podrán ver su historial de compras y hacer compras.
5. Los administradores podrán gestionar altas, bajas, cambios y búsquedas del catálogo de
usuarios.
6. Incluir el catálogo de usuarios con altas, bajas, cambios y busqueda.
7. Incluir el catálogo de productos con altas, bajas, cambios y busqueda.
8. Registrar ventas mediante un carrito de compras que puedan usar los clientes
9. Pantalla para los administradores donde se puedan consultar las ventas
10. Los productos deben incluir el identificador, descripción, unidad, existencia, ubicación en el
almacén etc.
11. Las ventas deben guardar la fecha de la orden, los productos que se venden, subtotal, total
y el cliente.
12. Todos los registros guardados en la base de datos, deberán guardar el identificador del
usuario que lo generó en la aplicación, la fecha en que se generaron y el usuario y la fecha
de última modificación.
13. Se debe hacer uso de un web service para la consulta de las existencias de productos en
almacén.
14. Se debe desarrollar en MVC
15. Generación de la documentación técnica del proyecto.
16. Script de la base de datos.
Consideraciones generales:
Se desarrollará en equipos de 4 personas, y en el grupo de las 12:10, habrá dos grupos de 5 personas.
La última entrega del proyecto se hará mediante una presentación formal en el horario especificado
por el profesor, dicha presentación deberá tener una duración de máximo 10 minutos con una
penalización de 5% de valor del proyecto por cada minuto adicional que se utilice.
• El proyecto, el script de la base de datos, los recursos adicionales y la documentación, son
requisitos indispensables en la entrega del proyecto.
En el caso de que el equipo no entregue a tiempo, tendrá un día más para entregar pero con una
penalización del 15% del valor total de la entrega.
Las entregas primera y segunda, se harán mediante un reporte que documente de forma detallada
los elementos desarrollados, y una presentación de la funcionalidad de 5 minutos por equipo.
Primera	entrega 5	de	noviembre (30%)
Esta entrega se relalizará mediante un reporte donde se documente los detalles de lo que se llevó
a cabo. Se hará una presentación de 5 minutos demostrando la funcionalidad de cada elemento
desarrollado.
1. (20 %) Diseño (sin funcionalidad) de todas las vistas de la aplicación en JSP
2. (10 %) Diseño de la base de datos (diagrama relacional y script)
3. (10 %) Diagramas de secuencia de toda la funcionalidad considerando la arquitectura MVC
4. (10 %) Diagramas de casos de uso
5. (10 %) Documento de definición
6. (20 %) Funcionalidad de la pantalla de logeo
7. (20 %) Interfaz principal que muestre la información de acuerdo con el tipo de usuario que
se logea
Segunda entrega 15 de	noviembre (30%)
Esta entrega se relalizará mediante un reporte donde se documente los detalles de lo que se llevó
a cabo. Se hará una presentación de 5 minutos demostrando la funcionalidad de cada elemento
desarrollado.
1. (20%) Funcionalidad de ventana de logeo de tal manera que los puedan acceder solamente
a la funcionalidad que tengan permiso.
2. (15 %) Uso de web service para consulta de los datos de los usuarios en la pantalla de
logeo.
3. (15%) Funcionalidad del catálogo de clientes y usuarios (altas, bajas, cambios, consultas y
búsquedas de registros específicos), con acceso a la base de datos, usando MVC.
4. (30%) Funcionalidad del catálogo de productos (altas, bajas, cambios, búsquedas y
consultas).
5. (20%) Funcionalidad del formulario de registro de clientes (altas, bajas, cambios,
búsquedas y consultas).
Tercera	entrega	26 de	noviembre (40%)
Para esta entrega se realizará una presentación de 15 minutos por esquipo.
1. (20%) Interfaz de compras para que los clientes logeados puedan explorar los productos y
agregarlos al carrito
2. (20%) Funcionalidad completa del procesamiento del carrito de compras
3. (15%) Pantalla que muestre el historial de compras de los usuarios y que al dar clic en la
compra que se quiera consultar, se muestre el detalle de la compra seleccionada.
4. (20%) Implementación del sistema en un servidor con SSL
5. (10%) Uso de capa de persistencia de datos mediante entidades
6. (15%) Documentación técnica que incluya la descripción del cumplimiento de cada uno de
los puntos que se toman en cuenta en la lista de cotejo.
