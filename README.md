# Gestión de una Cadena de Restaurantes:
En un mundo cada vez más digitalizado, la eficiencia y adaptabilidad de los sistemas informáticos se han convertido en una prioridad para las organizaciones. Desde la gestión de cadenas de restaurantes hasta sistemas de bibliotecas digitales, la necesidad de sistemas robustos, flexibles y escalables es evidente. Implementar soluciones tecnológicas que permitan una gestión efectiva y una experiencia de usuario optimizada es crucial.

 # - Objetivo del Ejercicio
El objetivo de este ejercicio es desarrollar un sistema de gestión para una cadena de restaurantes que sea modular, extensible y capaz de adaptarse a las necesidades cambiantes del mercado y de los usuarios. Este sistema debe optimizar la operativa y el servicio al cliente a través de la tecnología, desde la gestión de reservas hasta la optimización de la experiencia del cliente.

# - Uso de Patrones de Diseño
Los patrones de diseño son soluciones probadas para problemas comunes en el desarrollo de software. En este ejercicio, se utilizan varios patrones de diseño para abordar diferentes aspectos del sistema de gestión de restaurantes:

 - Singleton: Utilizado para garantizar que solo haya una instancia de la clase GestionRestaurantes, asegurando así una gestión centralizada de los restaurantes.

 - Factory: Utilizado para crear diferentes tipos de restaurantes (rápido, temático, de lujo) de manera flexible y sin acoplamiento directo.

 - Composite: Empleado para manejar tanto restaurantes individuales como grupos de restaurantes como una jerarquía, permitiendo una estructura organizada y escalable.

 - Strategy: Implementado para definir diferentes estrategias de servicio al cliente según el tipo de restaurante, permitiendo una fácil personalización y cambio de estrategias.

 - Adapter: Utilizado para integrar sistemas externos de reserva o entrega de comida, facilitando la interoperabilidad con otros sistemas.

 - Observer: Implementado para notificar cambios en el menú o promociones a los clientes suscritos, mejorando la comunicación y la experiencia del cliente.

 - Command: Empleado para ejecutar diferentes acciones en el restaurante, como reservar, ordenar o cancelar, permitiendo una gestión flexible y extensible de las operaciones.

 - Mediator: Utilizado para facilitar la comunicación entre diferentes componentes del restaurante, como la cocina, el servicio al cliente y la entrega, promoviendo un bajo acoplamiento y una alta cohesión.

 - State: Implementado para gestionar el estado de las mesas (libre, reservada, ocupada), permitiendo una fácil gestión del flujo de trabajo y de la disponibilidad de las mesas.

En conjunto, estos patrones de diseño proporcionan una estructura sólida y modular para el sistema de gestión de restaurantes, garantizando una implementación eficiente, flexible y fácil de mantener. Además se han agregado pruebas unitarias de los métodos complejos para comprobar el correcto funcionamiento del programa.

Link al repositorio: https://github.com/Samuu10/SamuelMunozVallejoQuintaPrueba.git
