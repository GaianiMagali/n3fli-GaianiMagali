# n3fli

Un sitio web de venta de contenido On-Demand nos solicita implementar su sistema de recomendación de contenidos. O sea que contenido se le va a recomendar a cada uno de los usuarios que entren a la plataforma.

El repositorio de la empresa tiene los contenidos disponibles y los usuarios que maneja el sistema. De los contenidos, se puede tener:
Series: pueden tener una o más temporadas. Cada temporada, a su vez, está compuesta por capítulos. La serie tiene ciertos actores que la protagonizan, y además cada capítulo puede tener actores invitados. De los capítulos, se conoce la duración en minutos y el número de orden dentro de la temporada. De las temporadas, se conoce el número y la cantidad de capítulos de la que consiste, incluso si todavía no salieron los mismos.
Películas. De estas, se conoce la duración en minutos y los actores.

Tanto las películas como las series tienen un género (Acción, Suspenso, Infantil, Terror, etc), que puede modelarse con un String. Los capítulos de serie y las temporadas se asumen como del género de la serie a la que pertenecen.

Cuando los usuarios se loguean, ven una lista de contenido recomendado; los contenidos incluidos en la lista de recomendados son:

Destacados: los contenidos destacados son aquellos que la empresa selecciona como destacados del mes.
Las series que el usuario vió, pero no en su totalidad (que no terminó de ver).

Para cada usuario, se conocen las películas y los capítulos de series que ya vio.


Requerimientos:

Saber si un usuario vio un contenido dado en forma completa. Los capítulos de series y las películas vistos por el usuario siempre se asumen completos, pero las temporadas y series dependen de los capítulos que el usuario haya visto. 

Saber la duración de un contenido. Para las temporadas y series, es la suma de las duraciones de todos sus capítulos.

Determinar el último capítulo disponible de una serie.


Saber los géneros que vio un usuario, sin repetición.
Saber el género preferido de un usuario, que es aquel género del cual se vieron más minutos.


Saber si un actor actuó en un contenido.
Saber quienes son los usuarios fans de un actor, que son aquellos que vieron sólo contenidos que incluyen a ese actor.

Saber qué contenidos del repositorio recomienda la empresa a un usuario. 

Cuando sale un capítulo de una serie, los administradores del sistema deben agregarlo al mismo. Los mismos deben cargarse en orden, por lo que no se puede agregar un capítulo si no están todos los capítulos anteriores ya cargados. Crear en el sistema un nuevo capítulo de una serie para una temporada dada (ya existente) y con un conjunto de actores invitados en el mismo que se conoce de antemano, de forma que cubra todo lo necesario para los requerimientos anteriores.
