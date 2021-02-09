# PROYECTOFINAL
Evaluación final módulo 5 y BootcampSistema de Asesorías En Prevención de Riesgos
*********************************************


Desarrolladores:
    - Yamilet Ancan
    - Daniela Segura
    - Juan Pablo Ibañez
    - Fernando Gonzalez 

Repositorios GitHub: 
    - Yamilet Ancan: https://github.com/YamiletNahuelcoy/PROYECTOFINAL.git
    - Daniela Segura: https://github.com/Daniela-Segura27/PROYECTOFINAL.git
    - Juan Pablo Ibañez: https://github.com/jpablo9006/PROYECTOFINAL.git
    - Fernando Gonzalez: https://github.com/Ciberspawn/PROYECTOFINAL.git


Proyecto:
    El presente proyecto es una plataforma de gestion de la informacion y procesos de una empresa de asesorías en aeguridad.
    La plataforma se presenta, entonces, como una solución tecnológica para los procesos de gestión, planificacion, control,  
    seguridad, y disponibilidad de información para la empresa y sus clientes. 
    
    El proyecto final de desarrollo funciona bajo un diseño MVC y consiste en una plataforma web dinamica JEE 
    con Sprig Framework que permite adminsitrar los principales procesos que se llevan a cabo día a día en 
    la empresa.

    Se han implementado vistas JSP con lenguaje html, junto a ello, se utilizo un modelo de mapeo de datos ORM
    a traves de la API de Persistencia de Java (JPA) para administrar la base de datos SQL y asi poder mostrar,
    registrar y editar informacion de la empresa. 

    En terminos de seguridad se utilizo un control de acceso mediante Spring Security, que gestiona los protocolos
    de seguridad ademas de los roles de acceso y autenticacion para la plataforma.
	

Para ello se incorporaron al proyecto Los siguientes elementos:


Paquete controlador
  Organizan funcionalidades del sistema:
    
    - AdministrativoController.java: Controla metodos y servicios asociados a la clase Administrativo.
    - CapacitacionController.java: Controla metodos y servicios asociados a la clase Capacitación.
    - ChequeoController.java: Controla metodos y servicios asociados a la clase Chequeo.
    - ClienteController.java: Controla metodos y servicios asociados a la clase Cliente.
    - ContactoController.java: Controla metodos y servicios asociados a la clase Contacto.
    - HomeController.java: Controla metodos de login, cierre de sesion y redireccion de los sitios asociados al menu de inicio.  
    - UsuarioController.java: Controla metodos y servicios asociados a la clase Usuario.
    - ProfesionalController.java: Controla metodos y servicios asociados a la clase Profesional.
    - PagoController.java: Controla metodos y servicios asociados a la clase Pago.
    - VisitaController.java: Controla metodos y servicios asociados a la clase Visita.
       
   
Paquete modelo
  Definiciones de clases o entidades que alimentan el sistema:
    - Administrativo.java: Contiene la clase Administrativo y sus Metodos.
    - AdministrativoRepositorio.java: Contiene el mecanismo Crud para objetos de tipo Administrativo (Permite crear, leer, editar o borrar).
    - Capacitacion.java: Contiene la clase Capacitacion y sus Metodos.
    - CapacitacionRepositorio.java: Contiene el mecanismo Crud para objetos de tipo Capacitacion (Permite crear, leer, editar o borrar).
    - Chequeo.java: Contiene la clase Chequeo y sus Metodos.
    - ChequeoRepositorio.java: Contiene el mecanismo Crud para objetos de tipo Chequeo (Permite crear, leer, editar o borrar).
    - Cliente.java: Contiene Objeto la clase Cliente y sus Metodos.
    - ClienteRepositorio.java: Contiene el mecanismo Crud para objetos de tipo Cliente (Permit crear, leer, editar o borrar).
    - Pago.java: Contiene la clase Pago y sus Metodos.
    - PagoRepositorio.java: Contiene el mecanismo Crud para objetos de tipo Pago (Permite crear, leer, editar o borrar).
    - Profesional.java: Contiene la clase Profesional y sus Metodos.
    - ProfesionalRepositorio.java: Contiene el mecanismo Crud para objetos de tipo Profesional (Permite crear, leer, editar o borrar).
    - Usuario.java: Contiene la clase Usuario y sus Metodos.
    - UsuarioRepositorio.java: Contiene el mecanismo Crud para objetos de tipo Usuario (Permite crear, leer, editar o borrar).
    - Visita.java: Contiene la clase Visita y sus Metodos.
    - VisitaRepositorio.java: Contiene el mecanismo Crud para objetos de tipo Visita (Permite crear, leer, editar o borrar).


Paquete servicio
 Interfases e implementacion de Interfases se servicio que dan funcionalidad a la gestion de datos de la empresa, administrando
 el manejo de informacion entre de la base de datos su controlador respectivo en la plataforma:

    - AdministrativoServicio.java: Interfaz de metodos de gestion de datos asociados a la clase Administrativo.
    - AdministrativoServicioImpl.java: Implementa interfaz de gestion de datos asociados a la clase Administrativo.
    - CapacitacionServicio.java: Interfaz de metodos de gestion de datos asociados a la clase Capacitacion.
    - CapacitacionServicioImpl.java: Implementa interfaz de gestion de datos asociados a la clase Capacitacion.
    - ChequeoServicio.java: Interfaz de metodos de gestion de datos asociados a la clase Chequeo.
    - ChequeoServicioImpl.java: Implementa interfaz de gestion de datos asociados a la clase Chequeo.
    - ClienteServicio.java: Interfaz de metodos de gestion de datos asociados a la clase Cliente.
    - ClienteServicioImpl.java: Implementa interfaz de gestion de datos asociados a la clase Cliente.
    - PagoServicio.java: Interfaz de metodos de gestion de datos asociados a la clase Pago.
    - PagoServicioImpl.java: Implementa interfaz de gestion de datos asociados a la clase Pago.
    - ProfesionalServicio.java: Interfaz de metodos de gestion de datos asociados a la clase Profesional.
    - ProfesionalServicioImpl.java: Implementa interfaz de gestion de datos asociados a la clase Profesional.
    - UsuarioServicio.java: Interfaz de metodos de gestion de datos asociados a la clase Usuario.
    - UsuarioServicioImpl.java: Implementa interfaz de gestion de datos asociados a la clase Usuario.
    - VisitaServicio.java: Interfaz de metodos de gestion de datos asociados a la clase Visita.
    - VisitaServicioImpl.java: Implementa interfaz de gestion de datos asociados a la clase Visita.
	
    Junto a estos elementos se administra la conexion y transacciones con la base de datos a traves de los archivos 
    jdvc.properties, root-context.xml y springSecurity.xml.

   
WEB-INF (Vistas), intefaces graficas de las funciones del Sistema:
    - FormContacto.jsp: Formulario de contacto para realizar consultas. 
    - FormCrearCapacitacion.jsp: Formulario para crear una capacitación en el sistema.
    - FormCrearPago.jsp: Formulario para crear un pago en el sistema.
    - FormCrearUsuario.jsp: Formulario que permitirá crear un usuario en sistema.
    - FormEditarAdministrativo.jsp: Formulario para modificar los datos de un usuario administrativo.
    - FormEditarCliente.jsp: Formulario para modificar los datos de un usuario cliente.
    - FormEditarProfesional.jsp: Formulario para modificar los datos de un usuario de profesional. 
    - FormListarCapacitaciones.jsp: Muestra Listado de capacitaciones registradas.
    - FormListarPagos.jsp: Muestra Listado de Pagos registradas.
    - FormListaUsuarios.jsp: Muestra Listado con los usuarios existentes en plataforma.
    - FormListaVisitas.jsp: Muestra Listado con las visitas existentes en plataforma.
    - FormResponderChecklist.jsp: Muestra formulario para responder un Checklist asociado a una visita.
    - Index.jsp: Página de inicio del portal con información relevante del proyecto.
    - Login.jsp: Sitio con acceso a las funcionalidades del sistema luego de ingresar RUT y clave.
    - Logout.jsp: Contiene mensajes de slida del usuario antes logeado en el Sistema.
    - msgcreacion.jsp: Contiene mensajes de creacion de nuevos elementos en del Sistema.


    Como complemento a las vistas del proyecto contempla documento Estilos.css con informacion 
    y configuracion del aspecto y estetica general de los sitios.

    Finalmente se contempla tambien un documento script.js con scripts de configuracion de validacion,
    plugins y otras funciones asociadas a las vistas del proyecto. 


Manejo de librerias y recursos externos:
    Se gestiona informacion y recursos necesarios para dar funcionalidad de las herramientas y lenguajes utilizados en el 
    sistema a traves del del archivo pom.xml


Uso de La plataforma:
*********************

Al abrir la plataforma se mostrará la pagina de inicio con acceso al Login.
Tras ingresar user y clave se obtendra acceso a funciones e informacion diferenciada para cada perfil (Administrativo, Cliente, Profesional).


Usuarios Cargados por defecto en la Plataforma:
  User: daniela
  Clave: daniela
  Perfil:Administrativo

  User: juanpablo
  Clave: juanpablo
  Perfil: Profesional
 
  User: fernando
  Clave: fernando
  Perfil: Cliente

Acceso disponible para perfil Administrativo
    
    - FormCrearPago.jsp
    - FormCrearUsuario.jsp
    - FormEditarAdministrativo.jsp
    - FormEditarCliente.jsp 
    - FormEditarProfesional.jsp
    - FormListarPagos.jsp
    - FormListaUsuarios.jsp
    - Index.jsp
    - Login.jsp
    - Logout.jsp
    - msgcreacion.jsp

Acceso disponible para perfil Cliente

    - FormCrearCapacitacion.jsp
    - FormListarCapacitaciones.jsp
    - Login.jsp
    - Index.jsp
    - Login.jsp
    - Logout.jsp
    - msgcreacion.jsp

Acceso disponible para perfil Profesional
    
    - FormListaVisitas.jsp
    - FormResponderChecklist.jsp
    - Login.jsp
    - Index.jsp
    - Login.jsp
    - Logout.jsp
    

Plataforma Web Creada en Bootcamp Awakelab Full Stack Java Trainee
Derechos Reservados G1 &copy; 2020
