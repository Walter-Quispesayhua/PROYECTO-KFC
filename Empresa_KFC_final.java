import java.util.Scanner;
public class Empresa_KFC_final  {
    public static void main(String[] args) {
        System.out.println(
                "⣿⣿⣿⣿⣿⣿⣿⡿⢟⣋⣭⣥⣭⣭⣍⡉⠉⠙⠛⠻⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                        "⣿⣿⣿⣿⣿⡏⠁⠠⠶⠛⠻⠿⣿⣿⣿⣿⣷⡄⠄⠄⠄⠄⠉⠻⢿⣿⣿⣿⣿⣿\n" +
                        "⣿⣿⣿⣿⠟⠄⢀⡴⢊⣴⣶⣶⣾⣿⣿⣿⣿⢿⡄⠄⠄⠄⠄⠄⠄⠙⢿⣿⣿⣿\n" +
                        "⣿⣿⡿⠁⠄⠙⡟⠁⣾⣿⣿⣿⣿⣿⣿⣿⣿⣎⠃⠄⠄⠄⠄⠄⠄⠄⠈⢻⣿⣿\n" +
                        "⣿⡟⠄⠄⠄⠄⡇⠰⠟⠛⠛⠿⠿⠟⢋⢉⠍⢩⣠⡀⠄⠄⠄⠄⠄⠄⠄⠄⢹⣿\n" +
                        "⣿⠁⠄⠄⠄⠄⠰⠁⣑⣬⣤⡀⣾⣦⣶⣾⣖⣼⣿⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⢿\n" +
                        "⡏⠄⠄⠄⠄⠄⠄⠄⠨⣿⠟⠰⠻⠿⣣⡙⠿⣿⠋⠄⢀⡀⣀⠄⣀⣀⢀⣀⣀⢸\n" +
                        "⡇⠄⠄⠄⠄⠄⠄⠄⠄⣠⠄⠚⠛⠉⠭⣉⢁⣿⠄⢀⡿⢾⣅⢸⡗⠂⢿⣀⡀⢸\n" +
                        "⡇⠄⠄⠄⠄⠄⠄⠄⠄⠘⢧⣄⠄⣻⣿⣿⣾⠟⣀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢸\n" +
                        "⣿⠄⠄⠄⠄⠄⠄⠄⠄⢠⡀⠄⠄⣿⣿⠟⢁⣴⣿⢸⡄⠄⢦⣤⣤⣤⣤⣄⡀⣼\n" +
                        "⣿⣧⠄⠄⠄⠄⠄⠄⢠⡸⣿⠒⠄⠈⠛⠄⠁⢹⡟⣾⡇⠄⠈⢿⣿⣿⣿⣿⣿⣿\n" +
                        "⣿⣿⣧⣠⣴⣦⠄⠄⢸⣷⡹⣧⣖⡔⠄⠱⣮⣻⣷⣿⣿⠄⠄⠘⣿⣿⣿⣿⣿⣿\n" +
                        "⣿⣿⣿⣿⣿⡇⠄⠄⠸⠿⠿⠚⠛⠁⠂⠄⠉⠉⡅⢰⡆⢰⡄⠄⠘ ⣿⣿⣿⣿⣿\n" +
                        "⣿⣿⣿⣿⣿⣷⣤⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⣷⠘⣧⣠⣾⣿⣿⣿⣿⣿\n" +
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣷⣦⣤⣄⣀⣀⡀⠄⣀⣀⣹⣦⣽⣾⣿⣿⣿⣿⣿⣿⣿⣿");
        Empresa_KFC_final goku = new Empresa_KFC_final();
        Finiciar_sesion();
        goku.FMENU();
    }
    static void Finiciar_sesion() {
        String correo, correo_in, contraseña, contraseña_in, direccion;
        Scanner michi = new Scanner(System.in);
        Boolean InicioSesion = false;
        while (!InicioSesion) {
            System.out.println("---BIENVENIID@ KFC \uD83D\uDC74\uD83C\uDF57---");
            System.out.println("REGISTRAR CUENTA");
            System.out.println("Ingrese su correo");
            correo = michi.nextLine();
            System.out.println("Ingrese su contraseña");
            contraseña = michi.nextLine();
            System.out.println("INICIAR SESION");
            System.out.println("Ingrese su correo");
            correo_in = michi.nextLine();
            System.out.println("Ingrese su contraseña");
            contraseña_in = michi.nextLine();
            InicioSesion = true;
            do {
                System.out.println("ingrese su dirección" + "|DELIVERY|");
                direccion = michi.nextLine();
                if (direccion.trim().length() < 8) {
                    System.out.println("Por favor, ingrese una dirección válida.");
                }
            } while (direccion.trim().length() < 8);
            System.out.println("Dirección guardada: " + direccion);
        }
    }
    public void FMENU() {
        Scanner wal = new Scanner(System.in);
        System.out.println("-------------------------------------------");
        System.out.println("---A CONTINUACIÓN LE MOSTRAMOS EL MENÚ \uD83D\uDC73\uD83D\uDC13\uD83C\uDF5F---");
        System.out.println("1: MEGA REGULARES 🍗");
        System.out.println("2: PARA 2 🍗🍟");
        System.out.println("3: BIG BOX 🍗🍟");
        System.out.println("4: COMBOS🍗🍔🍟");
        System.out.println("5: SANDWICHES & TOSTADOS 🍔🍟----------------");
        System.out.println("Seleccione una opción:");
        String op = wal.nextLine();
        switch (op) {
            case "1":
                FMegas_Regulares();
                break;
            case "2":
                Bienvenidoo();
                break;
            case "3":
                FBIG_BOX();
                break;
            case "4":
                Bienvenida();
                break;
            case "5":
                MENU_SANDWICH();
                break;
            default:
                System.out.println("Opción no válida, por favor intente nuevamente.");
                FMENU();
                break;
        }
    }

    //////////////////////
    private String opcion, si, pago , menus;
    private int Unidad,dely = 7, i, DELY=7;
    private double precio,total,metodo_entrega,Totalapagar=precio*Unidad;;
    private boolean salir = false;
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    static String metodo_pago_seleccionado = "";
    static void metodo_de_pago(){
        Scanner opcion=new Scanner(System.in);
        int op;
        System.out.println("SELECIONE POR CUAL METODO DE PAGO, VA A RELIZAR SU PAGO");
        System.out.println("1:   TERJETA VISA/MASTERCARD");
        System.out.println("2:   YAPE (SOLO NUMERO)");
        System.out.println("3:   CONTRA ENTREGA (EFECTIVO)");
        op=opcion.nextInt();
        switch (op){
            case 1:
                metodopago_tarjeta();
                break;
            case 2:
                metodopago_yape();
                break;
            case 3:
                metodopago_contraentrega();
                break;
        }
    }
    static void metodopago_tarjeta() {
        String metodo, fecha, cvv,nombre,confirmar,volver,volverr,menu;
        boolean valida;
        Scanner wali = new Scanner(System.in);
        do {
            System.out.println("INGRESE EL NOMBRE Y APELLIDO DEL TITULAR DE LA TARJETA");
            nombre= wali.nextLine();
            System.out.println("INGRESE SU NUMERO DE TARJETA:  (1234 1234 1234 1234)");
            metodo = wali.nextLine().trim();
            if (metodo.length() != 19 || !metodo.matches("[4-5]\\d{3} \\d{4} \\d{4} \\d{4}")) {
                System.out.println("Por favor, INGRESE SU NUMERO DE TARJETA TAL COMO SE MUESTRA EN SU TARJETA.");
            } else {
                if (metodo.startsWith("4")) {
                    System.out.println("Tarjeta tipo: Visa");
                } else if (metodo.startsWith("5")) {
                    System.out.println("Tarjeta tipo: MasterCard");
                }
            }
        } while (metodo.length() != 19 || !metodo.matches("[4-5]\\d{3} \\d{4} \\d{4} \\d{4}"));
        do {
            System.out.println("INGRESE LA FECHA DE VENCIMIENTO DE SU TARJETA (MM/AAAA):");
            fecha = wali.nextLine().trim();
            valida = fecha.matches("\\d{2}/\\d{4}");
            if (valida) {
                String[] partes = fecha.split("/");
                int mes = Integer.parseInt(partes[0]);
                int año = Integer.parseInt(partes[1]);
                valida = (año >= 2024 && mes >= 6) && (año <= 2035 && mes <= 12);
            }
            if (!valida) {
                System.out.println("Por favor, SU TARJETA VENCIÓ, VUELVE A INTENTAR O CAMBIE EL METODO DE PAGO.");
            }
        } while (!valida);
        do {
            System.out.println("INGRESE SU CODIGO (CVV)");
            cvv = wali.nextLine().trim();
            if (cvv.length() != 3 || !cvv.matches("\\d{3}")) {
                System.out.println("Por favor, CODIGO (CVV) INCORRECTO O NO COENCIDE CON LA TERJETA, VUELVE A INTENTAR.");
            }
        }while (cvv.length() != 3 || !cvv.matches("\\d{3}"));
        System.out.println("DESEA CONFIRMAR SU METODO DE PAGO:  (SI/NO)");
        confirmar = wali.nextLine();
        if (confirmar.equals("si")||confirmar.equals("SI")){
            metodo_pago_seleccionado = "Tarjeta de Crédito/Débito";
            System.out.println("PAGO FUE REALIZADO CON EXITO");
            System.out.println("LA TRANSACCION FUE REALIZADA POR EL TITULAR: " + nombre);
            System.out.println("MONTO DESCONTADO A LA TARJETA: " + metodo + " -- " + fecha + " -- XXX");
            System.out.println("GRACIAS POR SU COMPRA");
        } else if (confirmar.equals("no")||confirmar.equals("NO")) {
            System.out.println("SU PAGO SE HA CANCELADO");
            System.out.println("¿DESEA CAMBIAR DE MÉTODO DE PAGO? (SI/NO)");
            volverr = wali.nextLine();
            if (volverr.equals("si") || volverr.equals("SI")) {
                metodo_de_pago();
            } else {
                System.out.println("SU PEDIDO SE HA CANCELADO");
                System.out.println("DESEA VOLVER AL MENU PRINCIPAL?? (SI/NO)");
                menu= wali.nextLine();
                if (menu.equals("si")||menu.equals("SI")) {
                    System.out.println("MENU");
                }else {
                    System.out.println("GRACIAS POR VISITAR LA PAGINA DE KFC");
                }
            }
        }
    }
    static void metodopago_yape(){
        String yape,confirmar,volver,volverr,menu;
        Scanner yapee =new Scanner(System.in);
        do {
            System.out.println("Ingrese su número de teléfono asociado a Yape para efectuar su pedido");
            yape = yapee.nextLine().trim();
            if (yape.length() !=9 || !yape.matches("[9]\\d{8}")){
                System.out.println("Número de Yape inválido. Por favor, ingrese un número de 9 dígitos que comience con 9");
            }
        } while (yape.length() !=9 || !yape.matches("[9]\\d{8}"));
        System.out.println("DESEA CONFIRMAR SU METODO DE PAGO:  (SI/NO)");
        confirmar = yapee.nextLine();
        if (confirmar.equals("si")||confirmar.equals("SI")){
            metodo_pago_seleccionado = "Yape";
            System.out.println("PAGO FUE REALIZADO CON EXITO");
            System.out.println("Pago realizado con éxito a través de Yape, con el numero de:" +yape);
            System.out.println("GRACIAS POR SU COMPRA");
        } else if (confirmar.equals("no")||confirmar.equals("NO")) {
            System.out.println("SU PAGO SE HA CANCELADO");
            System.out.println("¿DESEA CAMBIAR DE MÉTODO DE PAGO? (SI/NO)");
            volverr = yapee.nextLine();
            if (volverr.equals("si") || volverr.equals("SI")) {
                metodo_de_pago();
            } else {
                System.out.println("SU PEDIDO SE HA CANCELADO");
                System.out.println("DESEA VOLVER AL MENU PRINCIPAL?? (SI/NO)");
                menu= yapee.nextLine();
                if (menu.equals("si")||menu.equals("SI")) {
                    System.out.println("MENU");
                }else {
                    System.out.println("GRACIAS POR VISITAR LA PAGINA DE KFC");
                }
            }
        }
    }
    static void metodopago_contraentrega(){
        String contra,respuesta,menu, menus;
        Scanner entrega = new Scanner(System.in);
        System.out.println("SE REALIZA EL COBRO AL MOMENTO DE RECIBIR SU PEDIDD :) ");
        while (true){
            System.out.println("¿Está de acuerdo con el pago Contra-Entrega? (SI/NO)");
            contra = entrega.nextLine();
            if (contra.equals("si")||contra.equals("SI")) {
                metodo_pago_seleccionado = "Contra-Entrega";
                System.out.println("Gracias por confirmar. Su pedido se procesará con pago contra entrega.");
                System.out.println("GRACIAS POR SU COMPRA :) ");
                break;
            } else if (contra.equals("no")||contra.equals("NO")) {
                System.out.println("Ha cancelado la opción de pago contra entrega.");
                System.out.println("¿DESEA CAMBIAR DE MÉTODO DE PAGO? (SI/NO)");
                respuesta = entrega.nextLine();
                if (respuesta.equals("si")||respuesta.equals("SI")) {
                    metodo_de_pago();
                } else if (respuesta.equals("no")||respuesta.equals("NO")) {
                    System.out.println("SU PEDIDO SE A CANCELADO");
                    System.out.println("DESEA VOLVER AL MENU PRINCIPAL?? (SI/NO)");
                    menu=entrega.nextLine();
                    if (menu.equals("si")||menu.equals("SI")) {
                        System.out.println("MENU");
                    }else {
                        System.out.println("GRACIAS POR VISITAR LA PAGINA DE KFC");
                    }
                }
            }
        }
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public String FMegas_Regulares() {
        Scanner KFC = new Scanner(System.in);
        System.out.println("ESCOGE ENTRE ESTAS OPCIONES");
        System.out.println("1: MEGA MIX - 8 PIEZAS ");
        System.out.println("2: SUPER MEGA - 10 PIEZAS");
        System.out.println("3: MEGA FULL - 12 PIEZAS");
        System.out.println("4: MEGA GIGANTE - 14 PIEZAS ");
        System.out.println("5: MEGA 12 PIEZAS CON PAPAS");
        opcion = KFC.nextLine();
        switch (opcion) {
            case "MEGA MIX - 8 PIEZAS":
                precio=69.90;
                metodo_de_pago();
                String Mix = "";
                System.out.println("DELIVERY/RECOJO EN LA TIENDA");
                Mix = KFC.nextLine();
                switch (Mix) {
                    case "DELIVERY":
                        this.Fdelivery();
                        break;
                    case "RECOJO EN LA TIENDA":
                        double precio_tienda= 69.90;
                        double total_pagartienda;
                        double IGV = 0.18;
                        double factura;
                        int cantidad_tienda;
                        System.out.println("CUANTAS ORDENES DESEA LLEVAR");
                        cantidad_tienda = KFC.nextInt();
                        total_pagartienda = precio_tienda * cantidad_tienda;
                        System.out.println("EL TOTAL A PAGAR ES:" + total_pagartienda);
                        System.out.println("Su factura sería:");
                        factura = total_pagartienda * IGV;
                        factura = factura + total_pagartienda ;
                        System.out.println("Subtotal es de: " + total_pagartienda + " soles");
                        System.out.println("IGV = 18%");
                        System.out.println("Por favor su pedido, tiene un total de: " + total_pagartienda+ " soles");
                        System.out.println("GRACIAS POR SER CLINTE DE KFC");
                        break;


                }

            case "SUPER MEGA - 10 PIEZAS":
                precio=79.90;
                metodo_de_pago();
                String mega = "";
                System.out.println("DELIVERY/RECOJO EN LA TIENDA");
                mega = KFC.nextLine();

                switch (mega) {
                    case "DELIVERY":
                        this.Fdelivery();

                        break;
                    case "RECOJO EN LA TIENDA":
                        double precio_tienda= 79.90;
                        double total_pagartienda;
                        double IGV = 0.18;
                        double factura;
                        int cantidad_tienda;

                        System.out.println("CUANTAS ORDENES DESEA LLEVAR");
                        cantidad_tienda = KFC.nextInt();
                        total_pagartienda = precio_tienda * cantidad_tienda;
                        System.out.println("EL TOTAL A PAGAR ES:" + total_pagartienda);
                        System.out.println("Su factura sería:");
                        factura = total_pagartienda * IGV;
                        factura = factura + total_pagartienda ;
                        System.out.println("Subtotal es de: " + total_pagartienda + " soles");
                        System.out.println("IGV = 18%");
                        System.out.println("Por favor su pedido, tiene un total de: " + total_pagartienda+ " soles");
                        System.out.println("GRACIAS POR SER CLINTE DE KFC");
                        break;


                }

            case "MEGA FULL - 12 PIEZAS":
                precio=89.90;
                metodo_de_pago();
                String mega_full = "";
                System.out.println("DELIVERY/RECOJO EN LA TIENDA");
                mega_full = KFC.nextLine();
                switch (mega_full) {
                    case "DELIVERY":
                        this.Fdelivery();
                        break;
                    case "RECOJO EN LA TIENDA":
                        double precio_tienda= 89.90;
                        double total_pagartienda;
                        double IGV = 0.18;
                        double factura;
                        int cantidad_tienda;

                        System.out.println("CUANTAS ORDENES DESEA LLEVAR");
                        cantidad_tienda = KFC.nextInt();
                        total_pagartienda = precio_tienda * cantidad_tienda;
                        System.out.println("EL TOTAL A PAGAR ES:" + total_pagartienda);
                        System.out.println("Su factura sería:");
                        factura = total_pagartienda * IGV;
                        factura = factura + total_pagartienda ;
                        System.out.println("Subtotal es de: " + total_pagartienda + " soles");
                        System.out.println("IGV = 18%");
                        System.out.println("Por favor su pedido, tiene un total de: " + total_pagartienda+ " soles");
                        System.out.println("GRACIAS POR SER CLINTE DE KFC");
                        break;


                }
            case "MEGA GIGANTE - 14 PIEZAS ":
                precio=99.90;
                metodo_de_pago();
                String mega_gigante = "";
                System.out.println("DELIVERY/RECOJO EN LA TIENDA");
                mega_gigante = KFC.nextLine();
                switch (mega_gigante) {
                    case "DELIVERY":
                        this.Fdelivery();
                        break;
                    case "RECOJO EN LA TIENDA":
                        double precio_tienda= 99.90;
                        double total_pagartienda;
                        double IGV = 0.18;
                        double factura;
                        int cantidad_tienda;

                        System.out.println("CUANTAS ORDENES DESEA LLEVAR");
                        cantidad_tienda = KFC.nextInt();
                        total_pagartienda = precio_tienda * cantidad_tienda;
                        System.out.println("EL TOTAL A PAGAR ES:" + total_pagartienda);
                        System.out.println("Su factura sería:");
                        factura = total_pagartienda * IGV;
                        factura = factura + total_pagartienda ;
                        System.out.println("Subtotal es de: " + total_pagartienda + " soles");
                        System.out.println("IGV = 18%");
                        System.out.println("Por favor su pedido, tiene un total de: " + total_pagartienda+ " soles");
                        System.out.println("GRACIAS POR SER CLINTE DE KFC");
                        break;
                }
            case "MEGA 12 PIEZAS CON PAPAS":
                precio=77.90;
                metodo_de_pago();
                String mega_piezas = "";
                System.out.println("DELIVERY/RECOJO EN LA TIENDA");
                mega_piezas = KFC.nextLine();
                switch (mega_piezas) {
                    case "DELIVERY":
                        this.Fdelivery();
                        break;
                    case "RECOJO EN LA TIENDA":
                        double precio_tienda= 77.90;
                        double total_pagartienda;
                        double IGV = 0.18;
                        double factura;
                        int cantidad_tienda;

                        System.out.println("CUANTAS ORDENES DESEA LLEVAR");
                        cantidad_tienda = KFC.nextInt();
                        total_pagartienda = precio_tienda * cantidad_tienda;
                        System.out.println("EL TOTAL A PAGAR ES:" + total_pagartienda);
                        System.out.println("Su factura sería:");
                        factura = total_pagartienda * IGV;
                        factura = factura + total_pagartienda ;
                        System.out.println("Subtotal es de: " + total_pagartienda + " soles");
                        System.out.println("IGV = 18%");
                        System.out.println("Por favor su pedido, tiene un total de: " + total_pagartienda+ " soles");
                        System.out.println("GRACIAS POR SER CLINTE DE KFC");
                        break;
                }

        }

        return null;
    }

    static String Bienvenidoo() {
        Scanner KFC = new Scanner(System.in);
        int opcion_parados;
        System.out.println("------------------------");
        System.out.println("PARA DOS");
        System.out.println("------------------------");
        System.out.println("CHICK'N SHARE PARA COMPARTIR");
        System.out.println("QUE LE GUSTARIA CONSUMIR? TENEMOS LOS SIGUIENTES CHICK'NS: ");
        System.out.println("1. COMBO CHICK'N SHARE CLÁSICO ");
        System.out.println("2. CHICK'N SHARE 18 NUGGETS + 2 PAPAS  ");
        System.out.println("3. CHICK'N SHARE MIX 3 PIEZAS + 6 HOT WINGS O NUGGETS + 2 PAPAS ");
        System.out.println("4. CHICK'N SHARE NUGGETS Y HOT WINGS ");
        System.out.println("5. POP CORN PARA 2 ");
        opcion_parados = KFC.nextInt();

        switch (opcion_parados) {
            case 1:
                metodo_de_pago();
                CHICKN_COMBO_CLÁSICO();
                break;
            case 2:
                metodo_de_pago();
                CHICKN_18NUGGETS();
                break;
            case 3:
                metodo_de_pago();
                CHICKN_3_PIEZAS_6HOT_WINGS_WINGS();
                break;
            case 4:
                metodo_de_pago();
                CHICKN_SHARE_NUGGETS_Y_HOT_WINGS();
                break;
            case 5:
                metodo_de_pago();
                POP_POPCORN_PARA_DOS();
                break;
        }
        return null;
    }
    static String CHICKN_COMBO_CLÁSICO() {
        Scanner KFC = new Scanner(System.in);
        int opcion;
        System.out.println("---CHICKN_COMBO_CLÁSICO---");
        System.out.println("EL CHICK'N INCLUYE:");
        System.out.println("KFC Combo Chick'N Share Clásico4 Piezas de Pollo , 2 Papas Personales y 1 Bebida de 1 L");
        System.out.println("ELIJA LA OPCIÓN DE RECEPCIÓN DEL PEDIDO:");
        System.out.println("1. DELIVERY");
        System.out.println("2. RECOJO EN LA TIENDA");
        opcion = KFC.nextInt();
        switch (opcion) {
            case 1:
                int cantidad_delivery1;
                double precio_delivery1 = 40.90, total_pago_delivery1;
                System.out.println("¿CUANTAS ORDENES DESEA?");
                cantidad_delivery1 = KFC.nextInt();
                total_pago_delivery1 = precio_delivery1 * cantidad_delivery1;
                System.out.println("EL TOTAL A PAGAR ES:" + total_pago_delivery1);
                System.out.println("GRACIAS POR SER CLINTE DE KFC");
                break;
            case 2:
                int cantidad_delivery2;
                double precio_delivery2 = 40.90, total_pago_delivery2;
                System.out.println("¿CUANTAS ORDENES DESEA?");
                cantidad_delivery2 = KFC.nextInt();
                total_pago_delivery2 = precio_delivery2 * cantidad_delivery2;
                System.out.println("EL TOTAL A PAGAR ES:" + total_pago_delivery2);
                System.out.println("GRACIAS POR SER CLINTE DE KFC");
                break;
        }
        return null;
    }

    static String CHICKN_18NUGGETS() {

        Scanner KFC = new Scanner(System.in);
        int opcion;
        System.out.println("--- CHICKN_18NUGGETS---");
        System.out.println("EL CHICK'N INCLUYE:");
        System.out.println("KFC Chick'N Share 18 Nuggets + 2 Papas18 Nuggets y 2 Papas Personales");
        System.out.println("ELIJA LA OPCIÓN DE RECEPCIÓN DEL PEDIDO:");
        System.out.println("1. DELIVERY");
        System.out.println("2. RECOJO EN LA TIENDA");
        opcion = KFC.nextInt();

        switch (opcion) {

            case 1:
                int cantidad_delivery1;
                double precio_delivery1 = 38.00, total_pago_delivery1;
                System.out.println("¿CUANTAS ORDENES DESEA?");
                cantidad_delivery1 = KFC.nextInt();
                total_pago_delivery1 = precio_delivery1 * cantidad_delivery1;
                System.out.println("EL TOTAL A PAGAR ES:" + total_pago_delivery1);
                System.out.println("GRACIAS POR SER CLINTE DE KFC");
                break;
            case 2:
                double precio_tienda= 38.00;
                double total_pagartienda;
                double IGV = 0.18;
                double factura;
                int cantidad_tienda;

                System.out.println("CUANTAS ORDENES DESEA LLEVAR");
                cantidad_tienda = KFC.nextInt();
                total_pagartienda = precio_tienda * cantidad_tienda;
                System.out.println("EL TOTAL A PAGAR ES:" + total_pagartienda);
                System.out.println("Su factura sería:");
                factura = total_pagartienda * IGV;
                factura = factura + total_pagartienda ;
                System.out.println("Subtotal es de: " + total_pagartienda + " soles");
                System.out.println("IGV = 18%");
                System.out.println("Por favor su pedido, tiene un total de: " + total_pagartienda+ " soles");
                System.out.println("GRACIAS POR SER CLINTE DE KFC");
                break;

        }
        return null;
    }

    static String CHICKN_3_PIEZAS_6HOT_WINGS_WINGS() {

        Scanner KFC = new Scanner(System.in);
        int opcion;

        System.out.println("---CHICKN_3_PIEZAS_6HOT_WINGS_WINGS---");
        System.out.println("EL CHICK'N INCLUYE:");
        System.out.println("KFC Chick'N Share Mix 3 Piezas + 6 Hot Wings o Nuggets + 2 papas3 Piezas de Pollo, 6 Hot Wings o 6 Nuggets y 2 Papas Personales");
        System.out.println("ELIJA LA OPCIÓN DE RECEPCIÓN DEL PEDIDO:");
        System.out.println("1. DELIVERY");
        System.out.println("2. RECOJO EN LA TIENDA");
        opcion = KFC.nextInt();

        switch (opcion) {

            case 1:
                int cantidad_delivery1;
                double precio_delivery1 = 38.00, total_pago_delivery1;
                System.out.println("¿CUANTAS ORDENES DESEA?");
                cantidad_delivery1 = KFC.nextInt();
                total_pago_delivery1 = precio_delivery1 * cantidad_delivery1;
                System.out.println("EL TOTAL A PAGAR ES:" + total_pago_delivery1);
                System.out.println("GRACIAS POR SER CLINTE DE KFC");
                break;
            case 2:
                double precio_tienda= 38.00;
                double total_pagartienda;
                double IGV = 0.18;
                double factura;
                int cantidad_tienda;

                System.out.println("CUANTAS ORDENES DESEA LLEVAR");
                cantidad_tienda = KFC.nextInt();
                total_pagartienda = precio_tienda * cantidad_tienda;
                System.out.println("EL TOTAL A PAGAR ES:" + total_pagartienda);
                System.out.println("Su factura sería:");
                factura = total_pagartienda * IGV;
                factura = factura + total_pagartienda ;
                System.out.println("Subtotal es de: " + total_pagartienda + " soles");
                System.out.println("IGV = 18%");
                System.out.println("Por favor su pedido, tiene un total de: " + total_pagartienda+ " soles");
                System.out.println("GRACIAS POR SER CLINTE DE KFC");
                break;
        }
        return null;
    }

    static String CHICKN_SHARE_NUGGETS_Y_HOT_WINGS() {

        Scanner KFC = new Scanner(System.in);
        int opcion;

        System.out.println("---CHICKN_SHARE_NUGGETS_Y_HOT_WINGS---");
        System.out.println("EL CHICK'N INCLUYE:");
        System.out.println("KFC Chick'n Share Nuggets y Hot Wings8 Nuggets, 8 Hot Wings, 2 Papas Regulares y 1 Gaseosa 1L");
        System.out.println("ELIJA LA OPCIÓN DE RECEPCIÓN DEL PEDIDO:");
        System.out.println("1. DELIVERY");
        System.out.println("2. RECOJO EN LA TIENDA");
        opcion = KFC.nextInt();

        switch (opcion) {

            case 1:
                int cantidad_delivery1;
                double precio_delivery1 = 42.90, total_pago_delivery1;
                System.out.println("¿CUANTAS ORDENES DESEA?");
                cantidad_delivery1 = KFC.nextInt();
                total_pago_delivery1 = precio_delivery1 * cantidad_delivery1;
                System.out.println("EL TOTAL A PAGAR ES:" + total_pago_delivery1);
                System.out.println("GRACIAS POR SER CLINTE DE KFC");
                break;
            case 2:
                double precio_tienda= 42.90;
                double total_pagartienda;
                double IGV = 0.18;
                double factura;
                int cantidad_tienda;

                System.out.println("CUANTAS ORDENES DESEA LLEVAR");
                cantidad_tienda = KFC.nextInt();
                total_pagartienda = precio_tienda * cantidad_tienda;
                System.out.println("EL TOTAL A PAGAR ES:" + total_pagartienda);
                System.out.println("Su factura sería:");
                factura = total_pagartienda * IGV;
                factura = factura + total_pagartienda ;
                System.out.println("Subtotal es de: " + total_pagartienda + " soles");
                System.out.println("IGV = 18%");
                System.out.println("Por favor su pedido, tiene un total de: " + total_pagartienda+ " soles");
                System.out.println("GRACIAS POR SER CLINTE DE KFC");
                break;
        }
        return null;
    }

    static String POP_POPCORN_PARA_DOS() {

        Scanner KFC = new Scanner(System.in);
        int opcion;

        System.out.println("---POP_POPCORN_PARA_DOS-1--");
        System.out.println(" POP CORN PARA 2  INCLUYE:");
        System.out.println("KFC Pop Corn Para 22 Pop Corn y 1 Papa Familiar");
        System.out.println("ELIJA LA OPCIÓN DE RECEPCIÓN DEL PEDIDO:");
        System.out.println("1. DELIVERY");
        System.out.println("2. RECOJO EN LA TIENDA");
        opcion = KFC.nextInt();

        switch (opcion) {

            case 1:
                int cantidad_delivery1;
                double precio_delivery1 = 31.90, total_pago_delivery1;
                System.out.println("¿CUANTAS ORDENES DESEA?");
                cantidad_delivery1 = KFC.nextInt();
                total_pago_delivery1 = precio_delivery1 * cantidad_delivery1;
                System.out.println("EL TOTAL A PAGAR ES:" + total_pago_delivery1);
                System.out.println("GRACIAS POR SER CLINTE DE KFC");
                break;
            case 2:
                double precio_tienda= 31.00;
                double total_pagartienda;
                double IGV = 0.18;
                double factura;
                int cantidad_tienda;

                System.out.println("CUANTAS ORDENES DESEA LLEVAR");
                cantidad_tienda = KFC.nextInt();
                total_pagartienda = precio_tienda * cantidad_tienda;
                System.out.println("EL TOTAL A PAGAR ES:" + total_pagartienda);
                System.out.println("Su factura sería:");
                factura = total_pagartienda * IGV;
                factura = factura + total_pagartienda ;
                System.out.println("Subtotal es de: " + total_pagartienda + " soles");
                System.out.println("IGV = 18%");
                System.out.println("Por favor su pedido, tiene un total de: " + total_pagartienda+ " soles");
                System.out.println("GRACIAS POR SER CLINTE DE KFC");
                break;
        }
        return null;
    }


    ///////La persona elige su pedido
    public String FBIG_BOX () {
        Scanner KFC = new Scanner(System.in);
        System.out.println("BIG BOX:Opciones contundentes con piezas de pollo, papas, ensalada y gasesosa personal");
        System.out.println("---1_:BIG BOX KRUNCHY ==> s/.26.90---");
        System.out.println("---2-.BIG BOX KENTUNCKY CHIKEN SANDWINCH DELUXE ==> s/32.90---");
        System.out.println("---3-.BIG BOX POPCORN ==> s/33.90---");
        System.out.println("---4-.BIG BOX WOW ==> s/28.90---");
        System.out.println("---5-.BIG BOX CLASSIC ==> s/27.90---");
        System.out.println("---6-.BIG BOX FULL ==> s/34.90---");
        System.out.println(
                "⣿⣿⣿⣿⣿⣿⣿⡿⢟⣋⣭⣥⣭⣭⣍⡉⠉⠙⠛⠻⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                        "⣿⣿⣿⣿⣿⡏⠁⠠⠶⠛⠻⠿⣿⣿⣿⣿⣷⡄⠄⠄⠄⠄⠉⠻⢿⣿⣿⣿⣿⣿\n" +
                        "⣿⣿⣿⣿⠟⠄⢀⡴⢊⣴⣶⣶⣾⣿⣿⣿⣿⢿⡄⠄⠄⠄⠄⠄⠄⠙⢿⣿⣿⣿\n" +
                        "⣿⣿⡿⠁⠄⠙⡟⠁⣾⣿⣿⣿⣿⣿⣿⣿⣿⣎⠃⠄⠄⠄⠄⠄⠄⠄⠈⢻⣿⣿\n" +
                        "⣿⡟⠄⠄⠄⠄⡇⠰⠟⠛⠛⠿⠿⠟⢋⢉⠍⢩⣠⡀⠄⠄⠄⠄⠄⠄⠄⠄⢹⣿\n" +
                        "⣿⠁⠄⠄⠄⠄⠰⠁⣑⣬⣤⡀⣾⣦⣶⣾⣖⣼⣿⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⢿\n" +
                        "⡏⠄⠄⠄⠄⠄⠄⠄⠨⣿⠟⠰⠻⠿⣣⡙⠿⣿⠋⠄⢀⡀⣀⠄⣀⣀⢀⣀⣀⢸\n" +
                        "⡇⠄⠄⠄⠄⠄⠄⠄⠄⣠⠄⠚⠛⠉⠭⣉⢁⣿⠄⢀⡿⢾⣅⢸⡗⠂⢿⣀⡀⢸\n" +
                        "⡇⠄⠄⠄⠄⠄⠄⠄⠄⠘⢧⣄⠄⣻⣿⣿⣾⠟⣀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢸\n" +
                        "⣿⠄⠄⠄⠄⠄⠄⠄⠄⢠⡀⠄⠄⣿⣿⠟⢁⣴⣿⢸⡄⠄⢦⣤⣤⣤⣤⣄⡀⣼\n" +
                        "⣿⣧⠄⠄⠄⠄⠄⠄⢠⡸⣿⠒⠄⠈⠛⠄⠁⢹⡟⣾⡇⠄⠈⢿⣿⣿⣿⣿⣿⣿\n" +
                        "⣿⣿⣧⣠⣴⣦⠄⠄⢸⣷⡹⣧⣖⡔⠄⠱⣮⣻⣷⣿⣿⠄⠄⠘⣿⣿⣿⣿⣿⣿\n" +
                        "⣿⣿⣿⣿⣿⡇⠄⠄⠸⠿⠿⠚⠛⠁⠂⠄⠉⠉⡅⢰⡆⢰⡄⠄⠘⣿⣿⣿⣿⣿\n" +
                        "⣿⣿⣿⣿⣿⣷⣤⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⣷⠘⣧⣠⣾⣿⣿⣿⣿⣿\n" +
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣷⣦⣤⣄⣀⣀⡀⠄⣀⣀⣹⣦⣽⣾⣿⣿⣿⣿⣿⣿⣿⣿");
        opcion = KFC.nextLine();
        this.Fopcion_tomada();
        return null;
    }
    ///////La persona eligio entre las opciones que le ofrecimos
    public String Fopcion_tomada(){
        switch (opcion){
            case "1":
                metodo_de_pago();
                this.fKRUNCHY();
                break;
            case "2":
                metodo_de_pago();
                this.fKENTUNCKY_CHIKEN_SANDWINCH_DELUXE();
                break;
            case "3":
                metodo_de_pago();
                this.fPOPCORN();
                break;
            case "4":
                metodo_de_pago();
                this.fWOW();
                break;
            case "5":
                metodo_de_pago();
                this.fCLASSIC();
                break;
            case "6":
                metodo_de_pago();
                this.fFULL();
                break;
        }
        return null;
    }
    ///////"---1_:BIG BOX KRUNCHY---"
    public String fKRUNCHY() {
        Scanner KFC = new Scanner(System.in);
        precio = 26.90;
        double preciototal,DELY=5,Totalapagar;
        System.out.println("-----BIG BOX KRUNCHY----- ");
        System.out.println("Que deliciosa eleccion hizo ");
        System.out.println("Delivery");
        System.out.println("o");
        System.out.println("Recojo en tienda");
        String delyoreco= KFC.nextLine();
        switch (delyoreco){
            case "Delivery":
                this.Fdelivery();
                break;
            case "Recojo en tienda":
                System.out.println("Cuantas unidades desea llevar");
                int unid= KFC.nextInt();
                preciototal=unid*precio;
                System.out.println("El total a pagar seria:"+preciototal);
                System.out.println("Su factura seria");
                double higv = 0.18;
                double hpre_facatura = preciototal * higv;
                double hfacturas = hpre_facatura + preciototal;
                System.out.println("subtotal es dee..");
                System.out.println(preciototal + " soles");
                System.out.println("igv = 18%");
                System.out.println("por favor su pedido, tien un total dee..");
                System.out.println(+hfacturas + " soles ");
                break;
        }
        return null;
    }

    ///////"---2-.BIG BOX KENTUNCKY CHIKEN SANDWINCH DELUXE---"
    public String fKENTUNCKY_CHIKEN_SANDWINCH_DELUXE () {
        Scanner KFC = new Scanner(System.in);
        precio=32.90;
        double preciototal,DELY=5,Totalapagar;
        System.out.println("-----BIG BOX KENTUNCKY CHIKEN SANDWINCH DELUXE----- ");
        System.out.println("Que deliciosa eleccion hizo ");
        System.out.println("Delivery");
        System.out.println("o");
        System.out.println("Recojo en tienda");
        String delyoreco= KFC.nextLine();
        switch (delyoreco){
            case "Delivery":
                this.Fdelivery();
                break;
            case "Recojo en tienda":
                System.out.println("Cuantas unidades desea llevar");
                int unid= KFC.nextInt();
                preciototal=unid*precio;
                System.out.println("El total a pagar seria:"+preciototal);
                System.out.println("Su factura seria");
                double higv = 0.18;
                double hpre_facatura = preciototal * higv;
                double hfacturas = hpre_facatura + preciototal;
                System.out.println("subtotal es dee..");
                System.out.println(preciototal + " soles");
                System.out.println("igv = 18%");
                System.out.println("por favor su pedido, tien un total dee..");
                System.out.println(+hfacturas + " soles ");
                break;
        }
        return null;
    }
    ///////---3-.BIG BOX POPCORN---
    public String fPOPCORN () {
        Scanner KFC = new Scanner(System.in);
        precio=33.90;
        double preciototal,DELY=5,Totalapagar;
        System.out.println("-----BIG BOX POPCORN----- ");
        System.out.println("Que deliciosa eleccion hizo ");
        System.out.println("Delivery");
        System.out.println("o");
        System.out.println("Recojo en tienda");
        String delyoreco= KFC.nextLine();
        switch (delyoreco){
            case "Delivery":
                this.Fdelivery();
                break;
            case "Recojo en tienda":
                System.out.println("Cuantas unidades desea llevar");
                int unid= KFC.nextInt();
                preciototal=unid*precio;
                System.out.println("El total a pagar seria:"+preciototal);
                System.out.println("Su factura seria");
                double higv = 0.18;
                double hpre_facatura = preciototal * higv;
                double hfacturas = hpre_facatura + preciototal + DELY;
                System.out.println("subtotal es dee..");
                System.out.println(preciototal + " soles");
                System.out.println("igv = 18%");
                System.out.println("por favor su pedido, tien un total dee..");
                System.out.println(+hfacturas + " soles ");
                break;
        }
        return null;
    }
    ///////---4-.BIG BOX WOW---
    public String fWOW () {
        Scanner KFC = new Scanner(System.in);
        precio=28.90;
        double preciototal,DELY=5,Totalapagar;
        System.out.println("-----BIG BOX WOW----- ");
        System.out.println("Que deliciosa eleccion hizo ");
        System.out.println("Delivery");
        System.out.println("o");
        System.out.println("Recojo en tienda");
        String delyoreco= KFC.nextLine();
        switch (delyoreco){
            case "Delivery":
                this.Fdelivery();
                break;
            case "Recojo en tienda":
                System.out.println("Cuantas unidades desea llevar");
                int unid= KFC.nextInt();
                preciototal=unid*precio;
                System.out.println("El total a pagar seria:"+preciototal);
                System.out.println("Su factura seria");
                double higv = 0.18;
                double hpre_facatura = preciototal * higv;
                double hfacturas = hpre_facatura + preciototal + DELY;
                System.out.println("subtotal es dee..");
                System.out.println(preciototal + " soles");
                System.out.println("igv = 18%");
                System.out.println("por favor su pedido, tien un total dee..");
                System.out.println(+hfacturas + " soles ");
                break;
        }
        return null;
    }
    ///////5-.BIG BOX CLASSIC---
    public String fCLASSIC () {
        Scanner KFC = new Scanner(System.in);
        precio=27.90;
        double preciototal,DELY=5,Totalapagar;
        System.out.println("-----BIG BOX CLASSIC----- ");
        System.out.println("Que deliciosa eleccion hizo ");
        System.out.println("Delivery");
        System.out.println("o");
        System.out.println("Recojo en tienda");
        String delyoreco= KFC.nextLine();
        switch (delyoreco){
            case "Delivery":
                this.Fdelivery();
                break;
            case "Recojo en tienda":
                System.out.println("Cuantas unidades desea llevar");
                int unid= KFC.nextInt();
                preciototal=unid*precio;
                System.out.println("El total a pagar seria:"+preciototal);
                System.out.println("Su factura seria");
                double higv = 0.18;
                double hpre_facatura = preciototal * higv;
                double hfacturas = hpre_facatura + preciototal + DELY;
                System.out.println("subtotal es dee..");
                System.out.println(preciototal + " soles");
                System.out.println("igv = 18%");
                System.out.println("por favor su pedido, tien un total dee..");
                System.out.println(+hfacturas + " soles ");
                break;
        }
        return null;
    }
    ///////6-.BIG BOX FULL---
    public String fFULL () {
        Scanner KFC = new Scanner(System.in);
        precio=34.90;
        double preciototal,DELY=5,Totalapagar;
        System.out.println("-----BIG BOX FULL----- ");
        System.out.println("Que deliciosa eleccion hizo ");
        System.out.println("Delivery");
        System.out.println("o");
        System.out.println("Recojo en tienda");
        String delyoreco= KFC.nextLine();
        switch (delyoreco){
            case "Delivery":
                this.Fdelivery();
                break;
            case "Recojo en tienda":
                System.out.println("Cuantas unidades desea llevar");
                int unid= KFC.nextInt();
                preciototal=unid*precio;
                System.out.println("El total a pagar seria:"+preciototal);
                System.out.println("Su factura seria");
                double higv = 0.18;
                double hpre_facatura = preciototal * higv;
                double hfacturas = hpre_facatura + preciototal + DELY;
                System.out.println("subtotal es dee..");
                System.out.println(preciototal + " soles");
                System.out.println("igv = 18%");
                System.out.println("por favor su pedido, tien un total dee..");
                System.out.println(+hfacturas + " soles ");
                break;
        }
        return null;
    }

    static String Bienvenida() {

        Scanner KFC = new Scanner(System.in);
        int opcion_combos;
        System.out.println("---COMOBOS---");
        System.out.println("PIEZZAS DE POLLO, NUGGETS O HOTWINGS, ACOMPAÑADOS DE PAPAS Y GASEOSA PERSONAL");
        System.out.println("ESCOJA ENTRE LAS SIGUIENTES OPCIONES:");
        System.out.println("1. COMBO CLÁSICO");
        System.out.println("2. COMBO SNACKS");
        System.out.println("3. COMBO 8 HOT WINGS");
        System.out.println("4. COMBO 8 NUGGETS");
        System.out.println("5. COMBO POPCORN");
        opcion_combos = KFC.nextInt();

        switch (opcion_combos) {
            case 1:
                metodo_de_pago();
                COMBO_CLÁSICO();
                break;
            case 2:
                metodo_de_pago();
                COMBO_SNACKS();
                break;
            case 3:
                metodo_de_pago();
                COMBO_8_HOT_WINGS();
                break;
            case 4:
                metodo_de_pago();
                COMBO_8_NUGGETS();
                break;
            case 5:
                metodo_de_pago();
                COMBO_POPCORN();

                break;
        }
        return null;
    }

    static String COMBO_CLÁSICO() {

        Scanner KFC = new Scanner(System.in);
        int opcion;

        System.out.println("---COMBO_CLÁSICO---");
        System.out.println("EL COMBO INCLUYE:");
        System.out.println("2 Piezas de Pollo , 1 Papa Personal y 1 Bebida Personal");
        System.out.println("ELIJA LA OPCIÓN DE RECEPCIÓN DEL PEDIDO:");
        System.out.println("1. DELIVERY");
        System.out.println("2. RECOJO EN LA TIENDA");
        opcion = KFC.nextInt();

        switch (opcion) {


            case 1:
                int cantidad_delivery1;
                double precio_delivery1 = 20.90, total_pago_delivery1;
                System.out.println("¿CUANTAS ORDENES DESEA?");
                cantidad_delivery1 = KFC.nextInt();
                total_pago_delivery1 = precio_delivery1 * cantidad_delivery1;
                System.out.println("EL TOTAL A PAGAR ES:" + total_pago_delivery1);
                System.out.println("GRACIAS POR SER CLINTE DE KFC");
                break;
            case 2:
                double precio_tienda= 20.00;
                double total_pagartienda;
                double IGV = 0.18;
                double factura;
                int cantidad_tienda;

                System.out.println("CUANTAS ORDENES DESEA LLEVAR");
                cantidad_tienda = KFC.nextInt();
                total_pagartienda = precio_tienda * cantidad_tienda;
                System.out.println("EL TOTAL A PAGAR ES:" + total_pagartienda);
                System.out.println("Su factura sería:");
                factura = total_pagartienda * IGV;
                factura = factura + total_pagartienda ;
                System.out.println("Subtotal es de: " + total_pagartienda + " soles");
                System.out.println("IGV = 18%");
                System.out.println("Por favor su pedido, tiene un total de: " + total_pagartienda+ " soles");
                System.out.println("GRACIAS POR SER CLINTE DE KFC");
                break;
        }
        return null;
    }

    static String COMBO_SNACKS() {

        Scanner KFC = new Scanner(System.in);
        int opcion;
        System.out.println("---COMBO_SNACKS---");
        System.out.println("EL COMBO INCLUYE:");
        System.out.println("4 Hot Wings, 4 Nuggets, 1 Papa Personal y 1 Bebida Personal");
        System.out.println("ELIJA LA OPCIÓN DE RECEPCIÓN DEL PEDIDO:");
        System.out.println("1. DELIVERY");
        System.out.println("2. RECOJO EN LA TIENDA");
        opcion = KFC.nextInt();

        switch (opcion) {

            case 1:
                int cantidad_delivery1;
                double precio_delivery1 = 24.90, total_pago_delivery1;
                System.out.println("¿CUANTAS ORDENES DESEA?");
                cantidad_delivery1 = KFC.nextInt();
                total_pago_delivery1 = precio_delivery1 * cantidad_delivery1;
                System.out.println("EL TOTAL A PAGAR ES:" + total_pago_delivery1);
                System.out.println("GRACIAS POR SER CLINTE DE KFC");
                break;
            case 2:
                double precio_tienda= 24.90;
                double total_pagartienda;
                double IGV = 0.18;
                double factura;
                int cantidad_tienda;

                System.out.println("CUANTAS ORDENES DESEA LLEVAR");
                cantidad_tienda = KFC.nextInt();
                total_pagartienda = precio_tienda * cantidad_tienda;
                System.out.println("EL TOTAL A PAGAR ES:" + total_pagartienda);
                System.out.println("Su factura sería:");
                factura = total_pagartienda * IGV;
                factura = factura + total_pagartienda ;
                System.out.println("Subtotal es de: " + total_pagartienda + " soles");
                System.out.println("IGV = 18%");
                System.out.println("Por favor su pedido, tiene un total de: " + total_pagartienda+ " soles");
                System.out.println("GRACIAS POR SER CLINTE DE KFC");
                System.out.println("GRACIAS POR SER CLINTE DE KFC");
                break;

        }
        return null;
    }

    static String COMBO_8_HOT_WINGS() {

        Scanner KFC = new Scanner(System.in);
        int opcion;

        System.out.println("---COMBO_8_HOT_WINGS---");
        System.out.println("EL COMBO INCLUYE:");
        System.out.println("8 Hot Wings, 1 Papa Personal y 1 Bebida Personal (500ml) [Para Recojo en tienda la bebida personal se reemplaza por 1 vaso de bebida mediana]");
        System.out.println("ELIJA LA OPCIÓN DE RECEPCIÓN DEL PEDIDO:");
        System.out.println("1. DELIVERY");
        System.out.println("2. RECOJO EN LA TIENDA");
        opcion = KFC.nextInt();

        switch (opcion) {

            case 1:
                int cantidad_delivery1;
                double precio_delivery1 = 24.90, total_pago_delivery1;
                System.out.println("¿CUANTAS ORDENES DESEA?");
                cantidad_delivery1 = KFC.nextInt();
                total_pago_delivery1 = precio_delivery1 * cantidad_delivery1;
                System.out.println("EL TOTAL A PAGAR ES:" + total_pago_delivery1);
                System.out.println("GRACIAS POR SER CLINTE DE KFC");
                break;
            case 2:
                double precio_tienda= 24.90;
                double total_pagartienda;
                double IGV = 0.18;
                double factura;
                int cantidad_tienda;

                System.out.println("CUANTAS ORDENES DESEA LLEVAR");
                cantidad_tienda = KFC.nextInt();
                total_pagartienda = precio_tienda * cantidad_tienda;
                System.out.println("EL TOTAL A PAGAR ES:" + total_pagartienda);
                System.out.println("Su factura sería:");
                factura = total_pagartienda * IGV;
                factura = factura + total_pagartienda ;
                System.out.println("Subtotal es de: " + total_pagartienda + " soles");
                System.out.println("IGV = 18%");
                System.out.println("Por favor su pedido, tiene un total de: " + total_pagartienda+ " soles");
                System.out.println("GRACIAS POR SER CLINTE DE KFC");
                break;
        }
        return null;
    }

    static String COMBO_8_NUGGETS() {

        Scanner KFC = new Scanner(System.in);
        int opcion;

        System.out.println("---COMBO_8_NUGGETS---");
        System.out.println("EL COMBO INCLUYE:");
        System.out.println("8 Nuggets de Pollo, 1 Papa Personal y 1 Bebida Personal (500ml) [Para Recojo en tienda la bebida personal se reemplaza por 1 vaso de bebida mediana]");
        System.out.println("ELIJA LA OPCIÓN DE RECEPCIÓN DEL PEDIDO:");
        System.out.println("1. DELIVERY");
        System.out.println("2." + " RECOJO EN LA TIENDA");
        opcion = KFC.nextInt();

        switch (opcion) {

            case 1:
                int cantidad_delivery1;
                double precio_delivery1 = 24.90, total_pago_delivery1;
                System.out.println("¿CUANTAS ORDENES DESEA?");
                cantidad_delivery1 = KFC.nextInt();
                total_pago_delivery1 = precio_delivery1 * cantidad_delivery1;
                System.out.println("EL TOTAL A PAGAR ES:" + total_pago_delivery1);
                System.out.println("GRACIAS POR SER CLINTE DE KFC");
                break;
            case 2:
                double precio_tienda= 24.90;
                double total_pagartienda;
                double IGV = 0.18;
                double factura;
                int cantidad_tienda;

                System.out.println("CUANTAS ORDENES DESEA LLEVAR");
                cantidad_tienda = KFC.nextInt();
                total_pagartienda = precio_tienda * cantidad_tienda;
                System.out.println("EL TOTAL A PAGAR ES:" + total_pagartienda);
                System.out.println("Su factura sería:");
                factura = total_pagartienda * IGV;
                factura = factura + total_pagartienda ;
                System.out.println("Subtotal es de: " + total_pagartienda + " soles");
                System.out.println("IGV = 18%");
                System.out.println("Por favor su pedido, tiene un total de: " + total_pagartienda+ " soles");
                System.out.println("GRACIAS POR SER CLINTE DE KFC");
                break;
        }
        return null;
    }

    static String COMBO_POPCORN() {

        Scanner KFC = new Scanner(System.in);
        int opcion;

        System.out.println("---COMBO_POPCORN---");
        System.out.println("EL COMBO INCLUYE:");
        System.out.println("1 Pop Corn, 1 Papa Personal y 1 Bebida Personal");
        System.out.println("ELIJA LA OPCIÓN DE RECEPCIÓN DEL PEDIDO:");
        System.out.println("1. DELIVERY");
        System.out.println("2. RECOJO EN LA TIENDA");
        opcion = KFC.nextInt();
        switch (opcion) {
            case 1:
                int cantidad_delivery1;
                double precio_delivery1 = 24.90, total_pago_delivery1;
                System.out.println("¿CUANTAS ORDENES DESEA?");
                cantidad_delivery1 = KFC.nextInt();

                total_pago_delivery1 = precio_delivery1 * cantidad_delivery1;
                System.out.println("EL TOTAL A PAGAR ES:" + total_pago_delivery1);
                System.out.println("GRACIAS POR SER CLINTE DE KFC");
                break;
            case 2:
                double precio_tienda= 24.90;
                double total_pagartienda;
                double IGV = 0.18;
                double factura;
                int cantidad_tienda;

                System.out.println("CUANTAS ORDENES DESEA LLEVAR");
                cantidad_tienda = KFC.nextInt();
                total_pagartienda = precio_tienda * cantidad_tienda;
                System.out.println("EL TOTAL A PAGAR ES:" + total_pagartienda);
                System.out.println("Su factura sería:");
                factura = total_pagartienda * IGV;
                factura = factura + total_pagartienda ;
                System.out.println("Subtotal es de: " + total_pagartienda + " soles");
                System.out.println("IGV = 18%");
                System.out.println("Por favor su pedido, tiene un total de: " + total_pagartienda+ " soles");
                System.out.println("GRACIAS POR SER CLINTE DE KFC");
                break;
        }
        return null;
    }
    static void menu() {
        System.out.println("-------------------------------------");
        System.out.println("[sandwich y tostadas]");
        System.out.println("_____________________________________");
        System.out.println("Selecione una //opcion");
        System.out.println(" 1 .COMBO TWISTER TRADICIONAL");
        System.out.println(" 2 .COMBO TWISTER AMERICANO");
        System.out.println(" 3 .TOASTED TWISTER TRADICIONAL");
        System.out.println(" 4 .TOASTED TWISTER AMERICANO");
        System.out.println(" 5 .COMBO KENTUCKY CHICKEN SANDWICH");
        System.out.println(" 6 .KENTUCKY CHICKEN SANDWICH");
        System.out.println("------------------------------------");
        System.out.println("EMPIECE A ORDENAR");
    }
    static void confirmar(double total,boolean metodo_entrega) {
        System.out.println("subtotal es dee..");
        System.out.println(total + " soles");
        System.out.println("igv = 18%");
        System.out.println("delibery = 10 soles");
        System.out.println("recojo en tienda = 0 soles");
        System.out.println("por favor su pedido, tien un total dee..");
        System.out.println(+factura(total,metodo_entrega) + " soles ");
    }
    static double preciototal(double precio, int cantidad) {
        double total = precio * cantidad;
        return total;
    }
    static double factura(double total,boolean metodo_entrega) {
        double igv = 0.18;
        double delivery = metodo_entrega ? 10 : 0;
        double pre_facatura = total * igv;
        double facturas = pre_facatura + total + delivery;
        return facturas;
    }
    public void MENU_SANDWICH() {
        Scanner wali = new Scanner(System.in);
        menu();
        boolean metodo_entrega;
        precio=0;
        int cantidad, entrega;
        int opcion = wali.nextInt();
        wali.nextLine();
        switch (opcion) {
            case 1:
                precio = 24.90;
                System.out.println("COMBO TWISTER TRADICIONAL" + "||24 soles||");
                System.out.println("Descripcion del pedido:");
                System.out.println("Tostado con 2 Strips de Pollo, queso americano, lechuga, tomate y mayonesa), 1 Papa Personal y 1 Bebida Personal");
                System.out.println("Cuantas cantidades desea adquirir?");
                cantidad = wali.nextInt();
                System.out.println("DESEA CONFIRMAR TU PEDIDO DE: " + preciototal(precio, cantidad) + " soles");
                wali.nextLine();
                si = wali.nextLine();
                if (si.equals("SI") || si.equals("si")) {
                    System.out.println("SELECCIONE SU FORMA DE ENTREGA DE SU PEDIDO?");
                    System.out.println("1:  Delivery (10 soles)");
                    System.out.println("2:  Recojo en tienda (0 soles)");
                    entrega= wali.nextInt();
                    wali.nextLine();
                    metodo_entrega = entrega == 1;
                    System.out.println("su pedido seria deeee..");
                    confirmar(preciototal(precio, cantidad), metodo_entrega);
                    System.out.println("DESEA REALIZAR EL PAGO?? (SI/NO)");
                    pago= wali.nextLine();
                    if (pago.equals("si")||pago.equals("SI")){
                        metodo_de_pago();
                        System.out.println("PRESIONE ENTER PARA VER SU FACTURA");
                        wali.nextLine();
                        factura_ultima(preciototal(precio, cantidad), metodo_entrega);
                    } else if (pago.equals("no")||pago.equals("NO")){
                        System.out.println("su pedido se ha cancelado  :( ");
                        System.out.println("desea volver al menu?? (SI/NO)");
                        menus= wali.nextLine();
                        if (menus.equals("si")||menus.equals("SI")){
                            FMENU();
                        }
                        else {
                            System.out.println("GRACIAS POR VISTITAR LA PAGINA DE KFC");
                        }
                    }
                }
                break;
            case 2:
                precio = 25.90;
                System.out.println("COMBO TWISTER AMERICANO");
                System.out.println("Descripcion del pedido:");
                System.out.println("Tostado con 2 Strips de Pollo, queso americano, tocino, lechuga y salsa meltz, 1 Papa Personal y 1 Bebida Personal");
                System.out.println("Cuantas cantidades desea adquirir?");
                cantidad = wali.nextInt();
                System.out.println("DESEA CONFIRMAR TU PEDIDO DE: " + preciototal(precio, cantidad) + " soles");
                wali.nextLine();
                si = wali.nextLine();
                if (si.equals("SI") || si.equals("si")) {
                    System.out.println("SELECCIONE SU FORMA DE ENTREGA DE SU PEDIDO?");
                    System.out.println("1:  Delivery (10 soles)");
                    System.out.println("2:  Recojo en tienda (0 soles)");
                    entrega= wali.nextInt();
                    wali.nextLine();
                    metodo_entrega = entrega == 1;
                    System.out.println("su pedido seria deeee..");
                    confirmar(preciototal(precio, cantidad), metodo_entrega);
                    System.out.println("DESEA REALIZAR EL PAGO?? (SI/NO)");
                    pago= wali.nextLine();
                    if (pago.equals("si")||pago.equals("SI")){
                        metodo_de_pago();
                        System.out.println("PRESIONE ENTER PARA VER SU FACTURA");
                        wali.nextLine();
                        factura_ultima(preciototal(precio, cantidad), metodo_entrega);
                    } else if (pago.equals("no")||pago.equals("NO")){
                        System.out.println("su pedido se ha cancelado  :( ");
                        System.out.println("desea volver al menu?? (SI/NO)");
                        menus= wali.nextLine();
                        if (menus.equals("si")||menus.equals("SI")){
                            FMENU();
                        }
                        else {
                            System.out.println("GRACIAS POR VISTITAR LA PAGINA DE KFC");
                        }
                    }
                }
                break;
            case 3:
                precio = 18.90;
                System.out.println("TOASTED TWISTER TRADICIONAL");
                System.out.println("Descripcion del pedido:");
                System.out.println("Tostado con 2 Strips de Pollo, queso americano, lechuga, tomate y mayonesa");
                System.out.println("Cuantas cantidades desea adquirir?");
                cantidad = wali.nextInt();
                System.out.println("DESEA CONFIRMAR TU PEDIDO DE: " + preciototal(precio, cantidad) + " soles");
                wali.nextLine();
                si = wali.nextLine();
                if (si.equals("SI") || si.equals("si")) {
                    System.out.println("SELECCIONE SU FORMA DE ENTREGA DE SU PEDIDO?");
                    System.out.println("1:  Delivery (10 soles)");
                    System.out.println("2:  Recojo en tienda (0 soles)");
                    entrega= wali.nextInt();
                    wali.nextLine();
                    metodo_entrega = entrega == 1;
                    System.out.println("su pedido seria deeee..");
                    confirmar(preciototal(precio, cantidad), metodo_entrega);
                    System.out.println("DESEA REALIZAR EL PAGO?? (SI/NO)");
                    pago= wali.nextLine();
                    if (pago.equals("si")||pago.equals("SI")){
                        metodo_de_pago();
                        System.out.println("PRESIONE ENTER PARA VER SU FACTURA");
                        wali.nextLine();
                        factura_ultima(preciototal(precio, cantidad), metodo_entrega);
                    } else if (pago.equals("no")||pago.equals("NO")){
                        System.out.println("su pedido se ha cancelado  :( ");
                        System.out.println("desea volver al menu?? (SI/NO)");
                        menus= wali.nextLine();
                        if (menus.equals("si")||menus.equals("SI")){
                            FMENU();
                        }
                        else {
                            System.out.println("GRACIAS POR VISTITAR LA PAGINA DE KFC");
                        }
                    }
                }
                break;
            case 4:
                precio = 19.90;
                System.out.println("TOASTED TWISTER AMERICANO");
                System.out.println("Descripcion del pedido:");
                System.out.println("Tostado con 2 Strips de Pollo, queso americano, tocino, lechuga, tomate y salsa meltz");
                System.out.println("Cuantas cantidades desea adquirir?");
                cantidad = wali.nextInt();
                System.out.println("DESEA CONFIRMAR TU PEDIDO DE: " + preciototal(precio, cantidad) + " soles");
                wali.nextLine();
                si = wali.nextLine();
                if (si.equals("SI") || si.equals("si")) {
                    System.out.println("SELECCIONE SU FORMA DE ENTREGA DE SU PEDIDO?");
                    System.out.println("1:  Delivery (10 soles)");
                    System.out.println("2:  Recojo en tienda (0 soles)");
                    entrega= wali.nextInt();
                    wali.nextLine();
                    metodo_entrega = entrega == 1;
                    System.out.println("su pedido seria deeee..");
                    confirmar(preciototal(precio, cantidad), metodo_entrega);
                    System.out.println("DESEA REALIZAR EL PAGO?? (SI/NO)");
                    pago= wali.nextLine();
                    if (pago.equals("si")||pago.equals("SI")){
                        metodo_de_pago();
                        System.out.println("PRESIONE ENTER PARA VER SU FACTURA");
                        wali.nextLine();
                        factura_ultima(preciototal(precio, cantidad), metodo_entrega);
                    } else if (pago.equals("no")||pago.equals("NO")){
                        System.out.println("su pedido se ha cancelado  :( ");
                        System.out.println("desea volver al menu?? (SI/NO)");
                        menus= wali.nextLine();
                        if (menus.equals("si")||menus.equals("SI")){
                            FMENU();
                        }
                        else {
                            System.out.println("GRACIAS POR VISTITAR LA PAGINA DE KFC");
                        }
                    }
                }
                break;
            case 5:
                precio = 25.90;
                System.out.println("COMBO KENTUCKY CHICKEN SANDWICH");
                System.out.println("Descripcion del pedido:");
                System.out.println("1 Kentucky Chicken Sándwich, 1 Papa Personal y 1 Gaseosa Personal");
                System.out.println("Cuantas cantidades desea adquirir?");
                cantidad = wali.nextInt();
                System.out.println("DESEA CONFIRMAR TU PEDIDO DE: " + preciototal(precio, cantidad) + " soles");
                wali.nextLine();
                si = wali.nextLine();
                if (si.equals("SI") || si.equals("si")) {
                    System.out.println("SELECCIONE SU FORMA DE ENTREGA DE SU PEDIDO?");
                    System.out.println("1:  Delivery (10 soles)");
                    System.out.println("2:  Recojo en tienda (0 soles)");
                    entrega= wali.nextInt();
                    wali.nextLine();
                    metodo_entrega = entrega == 1;
                    System.out.println("su pedido seria deeee..");
                    confirmar(preciototal(precio, cantidad), metodo_entrega);
                    System.out.println("DESEA REALIZAR EL PAGO?? (SI/NO)");
                    pago= wali.nextLine();
                    if (pago.equals("si")||pago.equals("SI")){
                        metodo_de_pago();
                        System.out.println("PRESIONE ENTER PARA VER SU FACTURA");
                        wali.nextLine();
                        factura_ultima(preciototal(precio, cantidad), metodo_entrega);
                    } else if (pago.equals("no")||pago.equals("NO")){
                        System.out.println("su pedido se ha cancelado  :( ");
                        System.out.println("desea volver al menu?? (SI/NO)");
                        menus= wali.nextLine();
                        if (menus.equals("si")||menus.equals("SI")){
                            FMENU();
                        }
                        else {
                            System.out.println("GRACIAS POR VISTITAR LA PAGINA DE KFC");
                        }
                    }
                }
                break;
            case 6:
                precio = 19.90;
                System.out.println("KENTUCKY CHICKEN SANDWICH");
                System.out.println("Descripcion del pedido:");
                System.out.println("Sandwich de pan brioche con mantequilla, pechuga de Pollo crujiente con triple empanizado, mayonesa premium y pepinillos");
                System.out.println("Cuantas cantidades desea adquirir?");
                cantidad = wali.nextInt();
                System.out.println("DESEA CONFIRMAR TU PEDIDO DE: " + preciototal(precio, cantidad) + " soles");
                wali.nextLine();
                si = wali.nextLine();
                if (si.equals("SI") || si.equals("si")) {
                    System.out.println("SELECCIONE SU FORMA DE ENTREGA DE SU PEDIDO?");
                    System.out.println("1:  Delivery (10 soles)");
                    System.out.println("2:  Recojo en tienda (0 soles)");
                    entrega= wali.nextInt();
                    wali.nextLine();
                    metodo_entrega = entrega == 1;
                    System.out.println("su pedido seria deeee..");
                    confirmar(preciototal(precio, cantidad), metodo_entrega);
                    System.out.println("DESEA REALIZAR EL PAGO?? (SI/NO)");
                    pago= wali.nextLine();
                    if (pago.equals("si")||pago.equals("SI")){
                        metodo_de_pago();
                        System.out.println("PRESIONE ENTER PARA VER SU FACTURA");
                        wali.nextLine();
                        factura_ultima(preciototal(precio, cantidad), metodo_entrega);
                    } else if (pago.equals("no")||pago.equals("NO")){
                        System.out.println("su pedido se ha cancelado  :( ");
                        System.out.println("desea volver al menu?? (SI/NO)");
                        menus= wali.nextLine();
                        if (menus.equals("si")||menus.equals("SI")){
                            FMENU();
                        }
                        else {
                            System.out.println("GRACIAS POR VISTITAR LA PAGINA DE KFC");
                        }
                    }
                }
                break;
        }
    }
    private int km;
    private String Ubica_Salidas;

    public String Fdelivery() {
        Scanner Deliver = new Scanner(System.in);
        salir = false;
        System.out.println("DIreccion");
        System.out.println("0");
        System.out.println("Ubicacion actual");
        String Opcion = Deliver.nextLine();
        switch (Opcion) {
            case "Direccion":
                System.out.println("Elija cual es su direccion Actual");
                System.out.println("1: ==>  Salida Lampa ");//25KM
                System.out.println("2: ==>  Salida Cusco");//30KM
                System.out.println("3: ==>  Plaza de armas");//15KM
                System.out.println("4: ==>  Salida Tacna");//60KM
                System.out.println("5: ==>  Salida Arequipa");//70KM
                Ubica_Salidas=Deliver.nextLine();
                switch (Ubica_Salidas){
                    case "1":
                        km=25;
                        this.Fcarro();
                        break;
                    case "2":
                        km=30;
                        this.Fcarro();
                        break;
                    case "3":
                        km=15;
                        this.Fcarro();
                        break;
                    case "4":
                        km=60;
                        this.Fcarro();
                        break;
                    case "5":
                        km=70;
                        this.Fcarro();
                        break;
                }
                System.out.println("El total a pagar seria:"+Totalapagar);
                System.out.println("Su factura seria");
                double igv = 0.18;
                double pre_facatura = Totalapagar * igv;
                double facturas = pre_facatura + Totalapagar + DELY;
                System.out.println("subtotal es dee..");
                System.out.println(Totalapagar + " soles");
                System.out.println("igv = 18%");
                System.out.println("delibery = 7 soles");
                System.out.println("por favor su pedido, tien un total dee..");
                System.out.println(+facturas + " soles ");
                System.out.println("---Gracias por su compra---");
                System.out.println(
                        "⣿⣿⣿⣿⣿⣿⣿⡿⢟⣋⣭⣥⣭⣭⣍⡉⠉⠙⠛⠻⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                                "⣿⣿⣿⣿⣿⡏⠁⠠⠶⠛⠻⠿⣿⣿⣿⣿⣷⡄⠄⠄⠄⠄⠉⠻⢿⣿⣿⣿⣿⣿\n" +
                                "⣿⣿⣿⣿⠟⠄⢀⡴⢊⣴⣶⣶⣾⣿⣿⣿⣿⢿⡄⠄⠄⠄⠄⠄⠄⠙⢿⣿⣿⣿\n" +
                                "⣿⣿⡿⠁⠄⠙⡟⠁⣾⣿⣿⣿⣿⣿⣿⣿⣿⣎⠃⠄⠄⠄⠄⠄⠄⠄⠈⢻⣿⣿\n" +
                                "⣿⡟⠄⠄⠄⠄⡇⠰⠟⠛⠛⠿⠿⠟⢋⢉⠍⢩⣠⡀⠄⠄⠄⠄⠄⠄⠄⠄⢹⣿\n" +
                                "⣿⠁⠄⠄⠄⠄⠰⠁⣑⣬⣤⡀⣾⣦⣶⣾⣖⣼⣿⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⢿\n" +
                                "⡏⠄⠄⠄⠄⠄⠄⠄⠨⣿⠟⠰⠻⠿⣣⡙⠿⣿⠋⠄⢀⡀⣀⠄⣀⣀⢀⣀⣀⢸\n" +
                                "⡇⠄⠄⠄⠄⠄⠄⠄⠄⣠⠄⠚⠛⠉⠭⣉⢁⣿⠄⢀⡿⢾⣅⢸⡗⠂⢿⣀⡀⢸\n" +
                                "⡇⠄⠄⠄⠄⠄⠄⠄⠄⠘⢧⣄⠄⣻⣿⣿⣾⠟⣀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢸\n" +
                                "⣿⠄⠄⠄⠄⠄⠄⠄⠄⢠⡀⠄⠄⣿⣿⠟⢁⣴⣿⢸⡄⠄⢦⣤⣤⣤⣤⣄⡀⣼\n" +
                                "⣿⣧⠄⠄⠄⠄⠄⠄⢠⡸⣿⠒⠄⠈⠛⠄⠁⢹⡟⣾⡇⠄⠈⢿⣿⣿⣿⣿⣿⣿\n" +
                                "⣿⣿⣧⣠⣴⣦⠄⠄⢸⣷⡹⣧⣖⡔⠄⠱⣮⣻⣷⣿⣿⠄⠄⠘⣿⣿⣿⣿⣿⣿\n" +
                                "⣿⣿⣿⣿⣿⡇⠄⠄⠸⠿⠿⠚⠛⠁⠂⠄⠉⠉⡅⢰⡆⢰⡄⠄⠘⣿⣿⣿⣿⣿\n" +
                                "⣿⣿⣿⣿⣿⣷⣤⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⣷⠘⣧⣠⣾⣿⣿⣿⣿⣿\n" +
                                "⣿⣿⣿⣿⣿⣿⣿⣿⣷⣦⣤⣄⣀⣀⡀⠄⣀⣀⣹⣦⣽⣾⣿⣿⣿⣿⣿⣿⣿⣿");
                break;
            case "Ubicacion actual":
                double K2M = 40;
                System.out.println("Ubicacion:Upeu");
                System.out.println("Su delivery vendra de inmediato");
                System.out.println("cuantas unidades desea llevar?");
                int unidades = Deliver.nextInt();
                double totalpagar = unidades + dely;
                System.out.println("Su pedido llegara antes que se enfrie ");
                for (i = 1; i <= K2M; i++) {
                    System.out.println("  __");
                    System.out.println(" /|||\\`.__");
                    System.out.println("(   _    _ _\\");
                    System.out.println("=`-()--()-'");
                    System.out.println("     o  o");
                    System.out.println("---------------------------------");
                    System.out.println("El total a pagar seria:"+Totalapagar);
                    System.out.println("Su factura seria");
                    double Higv = 0.18;
                    double Hpre_facatura = Totalapagar * Higv;
                    double Hfacturas = Hpre_facatura + Totalapagar + DELY;
                    System.out.println("subtotal es dee..");
                    System.out.println(Totalapagar + " soles");
                    System.out.println("igv = 18%");
                    System.out.println("delibery = 7 soles");
                    System.out.println("por favor su pedido, tien un total dee..");
                    System.out.println(+Hfacturas + " soles ");
                    System.out.println("Gracias por su compra");
                    System.out.println(
                            "⣿⣿⣿⣿⣿⣿⣿⡿⢟⣋⣭⣥⣭⣭⣍⡉⠉⠙⠛⠻⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                                    "⣿⣿⣿⣿⣿⡏⠁⠠⠶⠛⠻⠿⣿⣿⣿⣿⣷⡄⠄⠄⠄⠄⠉⠻⢿⣿⣿⣿⣿⣿\n" +
                                    "⣿⣿⣿⣿⠟⠄⢀⡴⢊⣴⣶⣶⣾⣿⣿⣿⣿⢿⡄⠄⠄⠄⠄⠄⠄⠙⢿⣿⣿⣿\n" +
                                    "⣿⣿⡿⠁⠄⠙⡟⠁⣾⣿⣿⣿⣿⣿⣿⣿⣿⣎⠃⠄⠄⠄⠄⠄⠄⠄⠈⢻⣿⣿\n" +
                                    "⣿⡟⠄⠄⠄⠄⡇⠰⠟⠛⠛⠿⠿⠟⢋⢉⠍⢩⣠⡀⠄⠄⠄⠄⠄⠄⠄⠄⢹⣿\n" +
                                    "⣿⠁⠄⠄⠄⠄⠰⠁⣑⣬⣤⡀⣾⣦⣶⣾⣖⣼⣿⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⢿\n" +
                                    "⡏⠄⠄⠄⠄⠄⠄⠄⠨⣿⠟⠰⠻⠿⣣⡙⠿⣿⠋⠄⢀⡀⣀⠄⣀⣀⢀⣀⣀⢸\n" +
                                    "⡇⠄⠄⠄⠄⠄⠄⠄⠄⣠⠄⠚⠛⠉⠭⣉⢁⣿⠄⢀⡿⢾⣅⢸⡗⠂⢿⣀⡀⢸\n" +
                                    "⡇⠄⠄⠄⠄⠄⠄⠄⠄⠘⢧⣄⠄⣻⣿⣿⣾⠟⣀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢸\n" +
                                    "⣿⠄⠄⠄⠄⠄⠄⠄⠄⢠⡀⠄⠄⣿⣿⠟⢁⣴⣿⢸⡄⠄⢦⣤⣤⣤⣤⣄⡀⣼\n" +
                                    "⣿⣧⠄⠄⠄⠄⠄⠄⢠⡸⣿⠒⠄⠈⠛⠄⠁⢹⡟⣾⡇⠄⠈⢿⣿⣿⣿⣿⣿⣿\n" +
                                    "⣿⣿⣧⣠⣴⣦⠄⠄⢸⣷⡹⣧⣖⡔⠄⠱⣮⣻⣷⣿⣿⠄⠄⠘⣿⣿⣿⣿⣿⣿\n" +
                                    "⣿⣿⣿⣿⣿⡇⠄⠄⠸⠿⠿⠚⠛⠁⠂⠄⠉⠉⡅⢰⡆⢰⡄⠄⠘⣿⣿⣿⣿⣿\n" +
                                    "⣿⣿⣿⣿⣿⣷⣤⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⣷⠘⣧⣠⣾⣿⣿⣿⣿⣿\n" +
                                    "⣿⣿⣿⣿⣿⣿⣿⣿⣷⣦⣤⣄⣀⣀⡀⠄⣀⣀⣹⣦⣽⣾⣿⣿⣿⣿⣿⣿⣿⣿");
                }
                break;
        }
        return null;
    }
    public String Fcarro(){
        Scanner Delive=new Scanner(System.in);
        System.out.println("Su pedido llegara antes que se enfrie ");
        for (i = 1; i <= km; i++) {
            if ( km <= 15) {
                System.out.println("  __");
                System.out.println(" /|||\\`.__");
                System.out.println("(   _    _ _\\");
                System.out.println("=`-()--()-'");
                System.out.println("     o  o");
                System.out.println("---------------------------------");
            } else if (km <= 25) {
                System.out.println("  __");
                System.out.println(" /|||\\`.__");
                System.out.println("(   _    _ _\\");
                System.out.println("=`-()--()-'");
                System.out.println("     o  o");
                System.out.println("---------------------------------");
            } else if (km <= 30) {
                System.out.println("  __");
                System.out.println(" /|||\\`.__");
                System.out.println("(   _    _ _\\");
                System.out.println("=`-()--()-'");
                System.out.println("     o  o");
                System.out.println("---------------------------------");
            } else if (km <= 60) {
                System.out.println("  __");
                System.out.println(" /|||\\`.__");
                System.out.println("(   _    _ _\\");
                System.out.println("=`-()--()-'");
                System.out.println("     o  o");
                System.out.println("---------------------------------");
            } else if (km <= 70) {
                System.out.println("  __");
                System.out.println(" /|||\\`.__");
                System.out.println("(   _    _ _\\");
                System.out.println("=`-()--()-'");
                System.out.println("     o  o");
                System.out.println("---------------------------------");
            }
        }
        return  null;
    }
    public void factura_ultima(double total, boolean metodo_entrega){
        Scanner wali=new Scanner(System.in);
        String volver;
        double subtotal = total;
        double igv = subtotal * 0.18;
        double delivery = metodo_entrega ? 10 : 0;
        double total_factura = subtotal + igv + delivery;
        System.out.println(
                "        "+ "⣿⣿⣿⣿⣿⣿⣿⡿⢟⣋⣭⣥⣭⣭⣍⡉⠉⠙⠛⠻⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                        "        "+ "⣿⣿⣿⣿⣿⡏⠁⠠⠶⠛⠻⠿⣿⣿⣿⣿⣷⡄⠄⠄⠄⠄⠉⠻⢿⣿⣿⣿⣿⣿\n" +
                        "        "+ "⣿⣿⣿⣿⠟⠄⢀⡴⢊⣴⣶⣶⣾⣿⣿⣿⣿⢿⡄⠄⠄⠄⠄⠄⠄⠙⢿⣿⣿⣿\n" +
                        "        "+ "⣿⣿⡿⠁⠄⠙⡟⠁⣾⣿⣿⣿⣿⣿⣿⣿⣿⣎⠃⠄⠄⠄⠄⠄⠄⠄⠈⢻⣿⣿\n" +
                        "        "+ "⣿⡟⠄⠄⠄⠄⡇⠰⠟⠛⠛⠿⠿⠟⢋⢉⠍⢩⣠⡀⠄⠄⠄⠄⠄⠄⠄⠄⢹⣿\n" +
                        "        "+ "⣿⠁⠄⠄⠄⠄⠰⠁⣑⣬⣤⡀⣾⣦⣶⣾⣖⣼⣿⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⢿\n" +
                        "        "+ "⡏⠄⠄⠄⠄⠄⠄⠄⠨⣿⠟⠰⠻⠿⣣⡙⠿⣿⠋⠄⢀⡀⣀⠄⣀⣀⢀⣀⣀⢸\n" +
                        "        "+ "⡇⠄⠄⠄⠄⠄⠄⠄⠄⣠⠄⠚⠛⠉⠭⣉⢁⣿⠄⢀⡿⢾⣅⢸⡗⠂⢿⣀⡀⢸\n" +
                        "        "+ "⡇⠄⠄⠄⠄⠄⠄⠄⠄⠘⢧⣄⠄⣻⣿⣿⣾⠟⣀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢸\n" +
                        "        "+ "⣿⠄⠄⠄⠄⠄⠄⠄⠄⢠⡀⠄⠄⣿⣿⠟⢁⣴⣿⢸⡄⠄⢦⣤⣤⣤⣤⣄⡀⣼\n" +
                        "        "+ "⣿⣧⠄⠄⠄⠄⠄⠄⢠⡸⣿⠒⠄⠈⠛⠄⠁⢹⡟⣾⡇⠄⠈⢿⣿⣿⣿⣿⣿⣿\n" +
                        "        "+ "⣿⣿⣧⣠⣴⣦⠄⠄⢸⣷⡹⣧⣖⡔⠄⠱⣮⣻⣷⣿⣿⠄⠄⠘⣿⣿⣿⣿⣿⣿\n" +
                        "        "+ "⣿⣿⣿⣿⣿⡇⠄⠄⠸⠿⠿⠚⠛⠁⠂⠄⠉⠉⡅⢰⡆⢰⡄⠄⠘ ⣿⣿⣿⣿\n" +
                        "        "+ "⣿⣿⣿⣿⣿⣷⣤⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⣷⠘⣧⣠⣾⣿⣿⣿⣿⣿\n" +
                        "        "+ "⣿⣿⣿⣿⣿⣿⣿⣿⣷⣦⣤⣄⣀⣀⡀⠄⣀⣀⣹⣦⣽⣾⣿⣿⣿⣿⣿⣿⣿⣿");
        System.out.println("          "+"KFC JR. San Martin, Juliaca 21103");
        System.out.println("                    "+"PEDIDO  :666");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Recepción: SAIT                                 10/07/2024");
        System.out.println("PEDIDO: 666                                    ");
        System.out.println("                                                 30077");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Método de entrega:                             " + (metodo_entrega ? "Delivery" : "Recojo en tienda"));
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Comunicado");
        System.out.println("Recuerda guardar la factura para la entrega/recoger su pedido :)");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Sub-total:                                     " + subtotal + " soles");
        System.out.println("IGV (18%):                                     " + igv + " soles");
        System.out.println("Delivery:                                      " + delivery + " soles");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Total:                                         " + total_factura + " soles");
        System.out.println("Medio de pago:                                 " + metodo_pago_seleccionado);
        System.out.println("--------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------");

        System.out.println("DESEA VOLVER AL MENU PRINCIPAL?? (SI/NO)");
        volver = wali.nextLine();
        if (volver.equals("si")||volver.equals("SI")) {
            FMENU();
        }else {
            System.out.println("Gracias por ser cliente de KFC");
            System.out.println("Esperamos que disfrute su compra :) ");
        }
    }

}

