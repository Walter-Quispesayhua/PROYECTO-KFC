object Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS {
    var precios_complementos_seleccionados:/*@@ycdtbc@@*/kotlin.collections.MutableList</*@@blnstr@@*/kotlin.Double?>? = java.util.ArrayList</*@@rfgzvf@@*/kotlin.Double?>()
    var precios_menu_selecionados:/*@@lgpnbn@@*/kotlin.collections.MutableList</*@@vmejeh@@*/kotlin.Double?>? = java.util.ArrayList</*@@eejbcm@@*/kotlin.Double?>()
    var menu_seleccionados:/*@@blgwkr@@*/kotlin.collections.MutableList</*@@gkcksi@@*/kotlin.String?>? = java.util.ArrayList</*@@xdsaae@@*/kotlin.String?>()
    var complementos_seleccionados:/*@@jcctcp@@*/kotlin.collections.MutableList</*@@qciqxh@@*/kotlin.String?>? = java.util.ArrayList</*@@genmel@@*/kotlin.String?>()
    var cantidades_menu_seleccionados:/*@@fcwwar@@*/kotlin.collections.MutableList</*@@ctvkyg@@*/Int?>? = java.util.ArrayList</*@@ifafei@@*/Int?>()
    var promociones_selecionadas:/*@@dhjkdv@@*/kotlin.collections.MutableList</*@@pvxkqk@@*/kotlin.String?>? = java.util.ArrayList</*@@zrgscs@@*/kotlin.String?>()
    var precios_promociones_selecionadas:/*@@qtrxgd@@*/kotlin.collections.MutableList</*@@owmssr@@*/kotlin.Double?>? = java.util.ArrayList</*@@excrfj@@*/kotlin.Double?>()
    var cantidades_promociones_seleccionados:/*@@bamzvi@@*/kotlin.collections.MutableList</*@@smsiot@@*/Int?>? = java.util.ArrayList</*@@hxfkai@@*/Int?>()
    var registro_de_usuarios:/*@@rhntfn@@*/kotlin.collections.MutableList</*@@issbpk@@*/kotlin.String?>? = java.util.ArrayList</*@@ptexcp@@*/kotlin.String?>()
    var registro_de_contraseñas:/*@@rshbdv@@*/kotlin.collections.MutableList</*@@rlmzyv@@*/kotlin.String?>? = java.util.ArrayList</*@@binlhj@@*/kotlin.String?>()
    var direccion_selecioanda:/*@@kozvsn@@*/kotlin.String? = ""
    var menuprincipal:/*@@zsghel@@*/kotlin.Array</*@@theiyb@@*/kotlin.String?>? = arrayOf</*@@grzrka@@*/kotlin.String?>("1.- MEGA REGULARES", "2.- PARA 2", "3.- BIG BOX", "4.- COMBOS", "5.- SANDWICHES & TOSTADOS", "6.- VER CARRITO", "7.- VOLVER A LA PAGINA PRINCIPAL")
    var dirreciones_de_entrega:/*@@phvvia@@*/kotlin.Array</*@@ojziqb@@*/kotlin.String?>? = arrayOf</*@@edtoam@@*/kotlin.String?>("1.- Salida a Lampa", "2.- Salida a Cusco", "3.- Salida a Puno", "4.- Salida a Tacna", "5.- Salida a Arequipa", "6.- Salida al Aeropuerto de Juliaca")

    var igv:/*@@fqxkie@@*/kotlin.Double = 0.18
    var direccion_de_kfc:/*@@ffogww@@*/kotlin.String? = "Jr. San Martin, Juliaca 21103"
    var registrarse:/*@@hzrsgj@@*/Boolean = false
    var inicio_sesion:/*@@hzrsgj@@*/Boolean = false
    var metodo_entrega:/*@@hzrsgj@@*/Boolean = false
    var metodo_de_pago_seleccioando:/*@@ywazpe@@*/kotlin.String? = ""

     fun /*@@dilgsa@@*/menu_principal() {
         var wali: /*@@ezhkkp@@*/java.util.Scanner? = java.util.Scanner(java.lang.System.`in`)
        for (MENU:/*@@pwsrvj@@*/kotlin.String? in Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menuprincipal)  {
            println(MENU)
        }
        println("Ingrese la opción deseada")
         var opcion: /*@@vxrcqj@@*/kotlin.String? = wali.nextLine()
        when(opcion){"1" -> Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_mega_regulares(wali)
            "2" -> Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_para_2(wali)
            "3" -> Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_big_box(wali)
            "4" -> Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_combos(wali)
            "5" -> Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_sandwiches_tostados(wali)
            "6" -> Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.carrito(Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.cantidades_menu_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_complementos_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_menu_selecionados,
            Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.complementos_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.promociones_selecionadas,
            Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_promociones_selecionadas, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.cantidades_promociones_seleccionados)
            "7" -> Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.pagina_principal()
            else -> println("Opción no válida.")
        }}

    var menu_sandwich:/*@@wporyu@@*/kotlin.Array</*@@cokzxh@@*/kotlin.Array</*@@ggcidb@@*/kotlin.String?>?>? = arrayOf</*@@loomfp@@*/kotlin.Array</*@@lvtibz@@*/kotlin.String?>?>(arrayOf</*@@aeggcn@@*/kotlin.String?>("1 .COMBO TWISTER TRADICIONAL (S/ 24.90)", "2 .COMBO TWISTER AMERICANO (S/ 25.90)"),
    arrayOf</*@@laywlu@@*/kotlin.String?>("3 .TOASTED TWISTER TRADICIONAL (S/ 18.90)", "4 .TOASTED TWISTER AMERICANO (S/ 19.90)"),
    arrayOf</*@@npznlg@@*/kotlin.String?>("5 .COMBO KENTUCKY CHICKEN SANDWICH (S/ 25.90)", "6 .KENTUCKY CHICKEN SANDWICH (S/ 19.90)")
    )
    var precio_sandwich:/*@@vglrlg@@*/kotlin.DoubleArray? = doubleArrayOf(24.90, 25.90, 18.90, 19.90, 25.90, 19.90)

    var menu_complementos:/*@@yqhswk@@*/kotlin.Array</*@@hmnfml@@*/kotlin.Array</*@@dalwri@@*/kotlin.String?>?>? = arrayOf</*@@adlzly@@*/kotlin.Array</*@@avkwgp@@*/kotlin.String?>?>(arrayOf</*@@blyldi@@*/kotlin.String?>("1 .PAQUETE 6 NUGGETS (S/ 15.90)", "2 .POPCORN CHICKEN (S/ 15.90)", "3 .PAQUETE 6 HOT WINGS (S/ 16.90)"),
    arrayOf</*@@hjfmls@@*/kotlin.String?>("4 .PAPA PERSONAL (S/ 5.90)", "5 .PAPA FAMILIAR (S/ 11.90)", "6 .PURÉ REGULAR (S/ 5.90)"),
    arrayOf</*@@eqeusz@@*/kotlin.String?>("7 .PURÉ FAMILIAR (S/ 11.00)", "8 .ENSALADA REGULAR (S/ 5.90)", "9 .ENSALADA FAMILIAR (S/ 11.00)"),
    arrayOf</*@@wqithi@@*/kotlin.String?>("10 .OCOPA FAMILIAR (S/ 4.90)", "11 .AJÍ CRIOLLO FAMILIAR (S/ 4.90)", "12 .INCA KOLA SIN AZÚCAR 500 ML (S/ 4.90)"),
    arrayOf</*@@whrtkr@@*/kotlin.String?>("13 .COCA-COLA SIN AZÚCAR 500 ML (S/ 4.90)", "14 .FANTA 500 ML (S/ 4.90)", "15 .INCA KOLA SIN AZÚCAR 1.5L (S/ 10.00)"),
    arrayOf</*@@cylomv@@*/kotlin.String?>("16 .COCA-COLA SIN AZÚCAR 1.5L (S/ 10.00)", "17 .FANTA 2.25L (S/ 13.00)", "18 .ROCOTO FAMILIAR (S/ 4.90)")
    )
    var precios_complementos:/*@@nirzvh@@*/kotlin.DoubleArray? = doubleArrayOf(15.90, 15.90, 16.90,
    5.90, 11.90, 5.90,
    11.00, 5.90, 11.00,
    4.90, 4.90, 4.90,
    4.90, 4.90, 10.00,
    10.00, 13.00, 4.90
    )

    var menu_mregalares:/*@@hqwquj@@*/kotlin.Array</*@@aguxej@@*/kotlin.Array</*@@ptofrl@@*/kotlin.String?>?>? = arrayOf</*@@szthwc@@*/kotlin.Array</*@@zrlbqs@@*/kotlin.String?>?>(arrayOf</*@@hylgbm@@*/kotlin.String?>("1 .MEGA MIX - 8 PIEZAS (S/ 69.90)", "2 .SUPER MEGA - 10 PIEZAS (S/ 79.90)"),
    arrayOf</*@@sdacxx@@*/kotlin.String?>("3 .MEGA FULL - 12 PIEZAS (S/ 89.90)", "4 .MEGA GIGANTE - 14 PIEZAS (S/ 99.90)"),
    )
    var precio_de_regulares:/*@@ymytkn@@*/kotlin.DoubleArray? = doubleArrayOf(69.90, 79.90, 89.90, 99.90)

    var menu_para_dos:/*@@feurgq@@*/kotlin.Array</*@@aaosnq@@*/kotlin.Array</*@@egphbl@@*/kotlin.String?>?>? = arrayOf</*@@mnkpjg@@*/kotlin.Array</*@@dobogt@@*/kotlin.String?>?>(arrayOf</*@@ftpnbt@@*/kotlin.String?>("1 .COMBO CHICKN SHARE CLÁSICO (S/ 40.90)", "2 .CHICKN SHARE 18 NUGGETS + 2 PAPAS (S/ 38.00)"),
    arrayOf</*@@aqgbxb@@*/kotlin.String?>("3 .CHICK'N SHARE MIX 3 PIEZAS (S/ 38.00)", "4 .CHICK'N SHARE NUGGETS Y HOT WINGS (S/ 42.90)")
    )
    var precio_para_dos:/*@@xtdkiv@@*/kotlin.DoubleArray? = doubleArrayOf(40.90, 38.00, 38.00, 42.90)

    var menu_big_box:/*@@kueqyu@@*/kotlin.Array</*@@idssxo@@*/kotlin.Array</*@@lmdrwk@@*/kotlin.String?>?>? = arrayOf</*@@cizwxw@@*/kotlin.Array</*@@ecysjp@@*/kotlin.String?>?>(arrayOf</*@@ncsppo@@*/kotlin.String?>("1 .BIG BOX KRUNCHY (S/ 26.90)", "2 .BIG BOX KENTUCKY CHICKEN SANDWICH DELUXE (S/ 32.90)"),
    arrayOf</*@@ocgevo@@*/kotlin.String?>("3 .BIG BOX POPCORN (S/ 33.90)", "4 .BIG BOX WOW (S/ 28.90)"),
    arrayOf</*@@etxena@@*/kotlin.String?>("5 .BIG BOX CLASSIC (S/ 27.90)", "6 .BIG BOX FULL (S/ 34.90)")
    )
    var precio_big_box:/*@@sdectk@@*/kotlin.DoubleArray? = doubleArrayOf(26.90, 32.90, 33.90, 28.90, 27.90, 34.90)

    var menu_combos:/*@@hvlanx@@*/kotlin.Array</*@@bkgygr@@*/kotlin.Array</*@@dsnrmv@@*/kotlin.String?>?>? = arrayOf</*@@vqaohe@@*/kotlin.Array</*@@cglwub@@*/kotlin.String?>?>(arrayOf</*@@dqlanz@@*/kotlin.String?>("1 .COMBO CLÁSICO (S/ 20.90)", "2 .COMBO SNACKS (S/ 24.90)"),
    arrayOf</*@@owapli@@*/kotlin.String?>("3 .COMBO 8 HOT WINGS (S/ 24.90)", "4 .COMBO 8 NUGGETS (S/ 24.90)")
    )
     //////////////////////////////////////////////////////////////////////////////////////////
    var precio_combos:/*@@pjznlv@@*/kotlin.DoubleArray? = doubleArrayOf(20.90, 24.90, 24.90, 24.90)
    var menu_promociones:/*@@smstmm@@*/kotlin.Array</*@@gqxgct@@*/kotlin.Array</*@@hcaweb@@*/kotlin.String?>?>? = arrayOf</*@@rucywj@@*/kotlin.Array</*@@qyvfif@@*/kotlin.String?>?>(arrayOf</*@@kndtyw@@*/kotlin.String?>("1.- KFC Mega Delivery - 6 Piezas (S/ 39)", "2.- KFC Mega Promo - 8 Piezas (S/ 49)"),
    arrayOf</*@@afgubm@@*/kotlin.String?>("3.- KFC Mega Promo - 10 Piezas (S/ 59)", "4.- KFC PopCorn Chicken Para 4 (S/ 29)"),
    arrayOf</*@@ostmbp@@*/kotlin.String?>("5.- KFC Krunchy Box (S/ 34)", "6.- KFC Krunchy Combo (S/ 40)"),
    arrayOf</*@@qheexe@@*/kotlin.String?>("7.- KFC Krunchy Para 2 (S/ 18)", "8.-KFC Krunchy Para 4 (S/ 55)"),
    arrayOf</*@@rseqed@@*/kotlin.String?>("9.-KFC Big Box Bucketeo (S/ 72)", "10.- KFC Big Box Full Salsa (S/ 79)")
    )
     //////////////////////////////////////////////////////////////////////////////////////////
    var precios_promociones:/*@@futsqa@@*/kotlin.DoubleArray? = doubleArrayOf(39.99, 49.99, 59.99, 29.99, 34.99, 40.99, 18.99, 55.99, 72.99, 79.99)

     fun /*@@ijlwos@@*/menu_mega_regulares(wali:/*@@ezhkkp@@*/java.util.Scanner?) {
        println("Menú MEGA REGULARES seleccionado")
        Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.seleccionacion_mega_regulares(wali)
    }
     //////////////////////////////////////////////////////////////////////////////////////////
     fun /*@@xmrjxg@@*/menu_para_2(wali:/*@@ezhkkp@@*/java.util.Scanner?) {
        println("Menú PARA 2 seleccionado")
        Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.seleccionacion_menu_para_2(wali)
    }
     //////////////////////////////////////////////////////////////////////////////////////////
     fun /*@@wxmjfb@@*/menu_big_box(wali:/*@@ezhkkp@@*/java.util.Scanner?) {
        println("Menú BIG BOX seleccionado")
        Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.seleccionacion_menu_big_box(wali)
    }
     //////////////////////////////////////////////////////////////////////////////////////////
     fun /*@@uhyjjz@@*/menu_combos(wali:/*@@ezhkkp@@*/java.util.Scanner?) {
        println("Menú COMBOS seleccionado")
        Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.seleccionacion_menu_combos(wali)
    }
     //////////////////////////////////////////////////////////////////////////////////////////
     fun /*@@iyvfyq@@*/menu_sandwiches_tostados(wali:/*@@ezhkkp@@*/java.util.Scanner?) {
        println("Menú SANDWICHES & TOSTADAS seleccionado")
        Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.seleccionacion_menu_sandwiches_tostados(wali)
    }
     //////////////////////////////////////////////////////////////////////////////////////////
     fun /*@@upjcjd@@*/seleccionacion_mega_regulares(wali:/*@@ezhkkp@@*/java.util.Scanner?) {
         var precios_complementos_seleccionados_temp: /*@@tmerzl@@*/kotlin.collections.MutableList</*@@jtoflf@@*/kotlin.Double?>? = java.util.ArrayList</*@@wulfeg@@*/kotlin.Double?>()
         var precios_menu_selecionados_temp: /*@@pifpxf@@*/kotlin.collections.MutableList</*@@ylypzd@@*/kotlin.Double?>? = java.util.ArrayList</*@@dwqyrc@@*/kotlin.Double?>()
         var menu_seleccionados_temp: /*@@rrcaxy@@*/kotlin.collections.MutableList</*@@uipaol@@*/kotlin.String?>? = java.util.ArrayList</*@@mkbbpk@@*/kotlin.String?>()
         var complementos_seleccionados_temp: /*@@pbwzul@@*/kotlin.collections.MutableList</*@@fezvbd@@*/kotlin.String?>? = java.util.ArrayList</*@@pbtgqo@@*/kotlin.String?>()
         var cantidades_menu_seleccionados_temp: /*@@rdublr@@*/kotlin.collections.MutableList</*@@aedjdj@@*/Int?>? = java.util.ArrayList</*@@quswss@@*/Int?>()
         var precio_seleccionado: /*@@fqxkie@@*/kotlin.Double = 0.0
         var cantidad_producto: /*@@nexomt@@*/Int = 0
        //////////////////////////////////////////////////////////////////////////////////////////
        for (fila:/*@@gakylw@@*/kotlin.Array</*@@qizfsc@@*/kotlin.String?>? in Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_mregalares)  {
            java.lang.System.out.printf("%-50s%-50s%n", fila.get(0), fila.get(1))
        }
        println("Seleccione una opción")
         var opcion: /*@@jpdfon@@*/kotlin.String? = wali.nextLine()
         var opcion_entero: /*@@nexomt@@*/Int = opcion.toInt()
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if (opcion_entero >= 1 && opcion_entero <= Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precio_de_regulares.size) {
            println("Seleccionó " + Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_mregalares.get(/*~~dznzou~~*/(opcion_entero - 1) / 2).get(/*~~cnazlr~~*/(opcion_entero - 1) % 2))
            precio_seleccionado = Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precio_de_regulares.get(opcion_entero - 1)
            menu_seleccionados_temp.add(Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_mregalares.get(/*~~wnnzkk~~*/(opcion_entero - 1) / 2).get(/*~~xzvnjg~~*/(opcion_entero - 1) % 2))
            precios_menu_selecionados_temp.add(precio_seleccionado)
            cantidades_menu_seleccionados_temp.add(cantidad_producto)
            Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_seleccionados.addAll(menu_seleccionados_temp)
            Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_menu_selecionados.addAll(precios_menu_selecionados_temp)

        } else {
            println("opción no válida.")
        }
        println("¿Cuántas unidades desea comprar?")
        cantidad_producto = wali.nextInt()
        cantidades_menu_seleccionados_temp.add(cantidad_producto)
        Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.cantidades_menu_seleccionados.add(cantidad_producto)
        wali.nextLine()
        println("¿Desea añadir algún complemento?")
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        for (i in Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_complementos.indices)  {
             var fila: /*@@xhfgrr@@*/kotlin.Array</*@@wmgjzj@@*/kotlin.String?>? = Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_complementos.get(i)
            java.lang.System.out.printf("%-50s%-50s%-50s%n", fila.get(0), fila.get(1), fila.get(2))
        }
         var opcion_complementos: /*@@nexomt@@*/Int
        while (/*~~yqmogl~~*/(wali.nextInt().also({ opcion_complementos = it })) != 0) {
            if (opcion_complementos > 0 && opcion_complementos <= Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_complementos.size) {
                complementos_seleccionados_temp.add(Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_complementos.get(/*~~ofifky~~*/(opcion_complementos - 1) / 3).get(/*~~dpttyi~~*/(opcion_complementos - 1) % 3))
                precios_complementos_seleccionados_temp.add(Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_complementos.get(opcion_complementos - 1))
                Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.complementos_seleccionados.addAll(complementos_seleccionados_temp)
                Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_complementos_seleccionados.addAll(precios_complementos_seleccionados_temp)
            } else {
                println("Opción no válida.")
            }
            println("Ingrese el número del complemento que desea agregar ( 0 para terminar):")
        }
        wali.nextLine()
         var totalPedido: /*@@fqxkie@@*/kotlin.Double = Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.pedido(cantidad_producto, precio_seleccionado, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_complementos_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_promociones_selecionadas)
        Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.informacion_pedido(totalPedido, menu_seleccionados_temp, cantidad_producto, complementos_seleccionados_temp, precios_menu_selecionados_temp, precios_complementos_seleccionados_temp)
        println("desea añadirlo a su carrito? (SI/NO)")
        opcion = wali.nextLine()
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if (opcion.equals("si", ignoreCase = true)) {
            println("desea:")
            println("1.- seguir comprando(volver al menu)")
            println("2.- ralizar el pago su pedido")
            println("3.- ver su carrito")
            println("4.- volver a la pagina principal")
            opcion = wali.nextLine()
            when(opcion){"1" -> Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_principal()
                "2" -> {
                    println(" ")
                    Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.carrito(Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.cantidades_menu_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_complementos_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_menu_selecionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.complementos_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.promociones_selecionadas, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_promociones_selecionadas, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.cantidades_promociones_seleccionados)
                }
                "3" -> Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.carrito(Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.cantidades_menu_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_complementos_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_menu_selecionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.complementos_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.promociones_selecionadas, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_promociones_selecionadas, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.cantidades_promociones_seleccionados)

                "4" -> Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.pagina_principal()
            }
            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            println("desea realizar el pago de su pedido? (SI/NO)")
            opcion = wali.nextLine()
            if (opcion.equals("si", ignoreCase = true)) {
                Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.carrito(Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.cantidades_menu_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_complementos_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_menu_selecionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.complementos_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.promociones_selecionadas, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_promociones_selecionadas, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.cantidades_promociones_seleccionados)
            } else {
                println("su pedido se a cancelado")
                println("No, nos dejes, deseaa..")
                println("1.- volver al menu principal")
                println("2.- volver a la pagina principal")
                println("3.- salir")
                opcion = wali.nextLine()
                when(opcion){"1" -> Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_principal()
                    "3" -> {
                        println("gracias por visitar la pagina de KFC")
                        println("esperamos, que vuelva pronto")
                    }}}
        }
    }
     ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     fun /*@@icerbc@@*/seleccionacion_menu_para_2(wali:/*@@ezhkkp@@*/java.util.Scanner?) {
         var precios_complementos_seleccionados_temp: /*@@unnzhk@@*/kotlin.collections.MutableList</*@@khpgqi@@*/kotlin.Double?>? = java.util.ArrayList</*@@mnbeqs@@*/kotlin.Double?>()
         var precios_menu_selecionados_temp: /*@@kzkmoq@@*/kotlin.collections.MutableList</*@@hpnikf@@*/kotlin.Double?>? = java.util.ArrayList</*@@loggmj@@*/kotlin.Double?>()
         var menu_seleccionados_temp: /*@@xsxiin@@*/kotlin.collections.MutableList</*@@uqeksi@@*/kotlin.String?>? = java.util.ArrayList</*@@veibdq@@*/kotlin.String?>()
         var complementos_seleccionados_temp: /*@@evsvqi@@*/kotlin.collections.MutableList</*@@towleh@@*/kotlin.String?>? = java.util.ArrayList</*@@xeituj@@*/kotlin.String?>()
         var cantidades_menu_seleccionados_temp: /*@@aoeofk@@*/kotlin.collections.MutableList</*@@krszra@@*/Int?>? = java.util.ArrayList</*@@slujrg@@*/Int?>()
         var precio_seleccionado: /*@@fqxkie@@*/kotlin.Double = 0.0
         var cantidad_producto: /*@@nexomt@@*/Int = 0

        for (fila:/*@@ilhpnv@@*/kotlin.Array</*@@oksrfr@@*/kotlin.String?>? in Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_para_dos)  {
            java.lang.System.out.printf("%-50s%-50s%n", fila.get(0), fila.get(1))
        }
        println("Seleccione una opción")
         var opcion: /*@@ozjuyw@@*/kotlin.String? = wali.nextLine()
         var opcion_entero: /*@@nexomt@@*/Int = opcion.toInt()
        if (opcion_entero >= 1 && opcion_entero <= Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precio_para_dos.size) {
            println("Seleccionó " + Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_para_dos.get(/*~~mgwgmt~~*/(opcion_entero - 1) / 2).get(/*~~qahvwg~~*/(opcion_entero - 1) % 2))
            precio_seleccionado = Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precio_para_dos.get(opcion_entero - 1)
            menu_seleccionados_temp.add(Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_para_dos.get(/*~~vggusw~~*/(opcion_entero - 1) / 2).get(/*~~fmpzgm~~*/(opcion_entero - 1) % 2))
            precios_menu_selecionados_temp.add(precio_seleccionado)
            cantidades_menu_seleccionados_temp.add(cantidad_producto)
            Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_seleccionados.addAll(menu_seleccionados_temp)
            Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_menu_selecionados.addAll(precios_menu_selecionados_temp)

        } else {
            println("opción no válida.")
        }
        println("¿Cuántas unidades desea comprar?")
        cantidad_producto = wali.nextInt()
        cantidades_menu_seleccionados_temp.add(cantidad_producto)
        Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.cantidades_menu_seleccionados.add(cantidad_producto)
        wali.nextLine()
        println("¿Desea añadir algún complemento?")
        for (i in Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_complementos.indices)  {
             var fila: /*@@xojfol@@*/kotlin.Array</*@@wbyjpq@@*/kotlin.String?>? = Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_complementos.get(i)
            java.lang.System.out.printf("%-50s%-50s%-50s%n", fila.get(0), fila.get(1), fila.get(2))
        }
         var opcion_complementos: /*@@nexomt@@*/Int
        while (/*~~uuuwmb~~*/(wali.nextInt().also({ opcion_complementos = it })) != 0) {
            if (opcion_complementos > 0 && opcion_complementos <= Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_complementos.size) {
                complementos_seleccionados_temp.add(Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_complementos.get(/*~~cylsxp~~*/(opcion_complementos - 1) / 3).get(/*~~yqmjch~~*/(opcion_complementos - 1) % 3))
                precios_complementos_seleccionados_temp.add(Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_complementos.get(opcion_complementos - 1))
                Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.complementos_seleccionados.addAll(complementos_seleccionados_temp)
                Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_complementos_seleccionados.addAll(precios_complementos_seleccionados_temp)
            } else {
                println("Opción no válida.")
            }
            println("Ingrese el número del complemento que desea agregar ( 0 para terminar):")
        }
        wali.nextLine()
         var totalPedido: /*@@fqxkie@@*/kotlin.Double = Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.pedido(cantidad_producto, precio_seleccionado, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_complementos_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_promociones_selecionadas)
        Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.informacion_pedido(totalPedido, menu_seleccionados_temp, cantidad_producto, complementos_seleccionados_temp, precios_menu_selecionados_temp, precios_complementos_seleccionados_temp)
        println("desea añadirlo a su carrito? (SI/NO)")
        opcion = wali.nextLine()
        if (opcion.equals("si", ignoreCase = true)) {
            println("desea:")
            println("1.- seguir comprando(volver al menu)")
            println("2.- realizar el pago su pedido")
            println("3.- ver su carrito")
            println("4.- volver a la pagina principal")
            opcion = wali.nextLine()
            when(opcion){"1" -> Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_principal()
                "2" -> {
                    println(" ")
                    Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.carrito(Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.cantidades_menu_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_complementos_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_menu_selecionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.complementos_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.promociones_selecionadas, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_promociones_selecionadas, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.cantidades_promociones_seleccionados)
                }
                "3" -> Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.carrito(Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.cantidades_menu_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_complementos_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_menu_selecionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.complementos_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.promociones_selecionadas, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_promociones_selecionadas, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.cantidades_promociones_seleccionados)
                "4" -> Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.pagina_principal()
            }} else {
            println("desea realizar el pago de su pedido? (SI/NO)")
            opcion = wali.nextLine()
            if (opcion.equals("si", ignoreCase = true)) {
                Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.carrito(Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.cantidades_menu_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_complementos_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_menu_selecionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.complementos_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.promociones_selecionadas, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_promociones_selecionadas, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.cantidades_promociones_seleccionados)
            } else {
                println("su pedido se a cancelado")
                println("No, nos dejes, deseaa..")
                println("1.- volver al menu principal")
                println("2.- volver a la pagina principal")
                println("3.- salir")
                opcion = wali.nextLine()
                when(opcion){"1" -> Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_principal()
                    "3" -> {
                        println("gracias por visitar la pagina de KFC")
                        println("esperamos, que vuelva pronto")
                    }}}
        }
    }
     fun /*@@qgabse@@*/seleccionacion_menu_big_box(wali:/*@@ezhkkp@@*/java.util.Scanner?) {
         var precios_complementos_seleccionados_temp: /*@@gxtamm@@*/kotlin.collections.MutableList</*@@nojosw@@*/kotlin.Double?>? = java.util.ArrayList</*@@fonbdd@@*/kotlin.Double?>()
         var precios_menu_selecionados_temp: /*@@ythsxx@@*/kotlin.collections.MutableList</*@@fwkowc@@*/kotlin.Double?>? = java.util.ArrayList</*@@kggvlm@@*/kotlin.Double?>()
         var menu_seleccionados_temp: /*@@jqcpma@@*/kotlin.collections.MutableList</*@@oawvql@@*/kotlin.String?>? = java.util.ArrayList</*@@rancnc@@*/kotlin.String?>()
         var complementos_seleccionados_temp: /*@@kfyzdy@@*/kotlin.collections.MutableList</*@@pobova@@*/kotlin.String?>? = java.util.ArrayList</*@@ejhxpp@@*/kotlin.String?>()
         var cantidades_menu_seleccionados_temp: /*@@zjaurv@@*/kotlin.collections.MutableList</*@@cawtkr@@*/Int?>? = java.util.ArrayList</*@@ixbxyg@@*/Int?>()
         var precio_seleccionado: /*@@fqxkie@@*/kotlin.Double = 0.0
         var cantidad_producto: /*@@nexomt@@*/Int = 0

        for (fila:/*@@sjhmuv@@*/kotlin.Array</*@@upnrqr@@*/kotlin.String?>? in Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_big_box)  {
            java.lang.System.out.printf("%-50s%-50s%n", fila.get(0), fila.get(1))
        }
        println("Seleccione una opción")
         var opcion: /*@@kucfky@@*/kotlin.String? = wali.nextLine()
         var opcion_entero: /*@@nexomt@@*/Int = opcion.toInt()
        if (opcion_entero >= 1 && opcion_entero <= Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precio_big_box.size) {
            println("Seleccionó " + Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_big_box.get(/*~~fsqnod~~*/(opcion_entero - 1) / 2).get(/*~~kauxrr~~*/(opcion_entero - 1) % 2))
            precio_seleccionado = Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precio_big_box.get(opcion_entero - 1)
            menu_seleccionados_temp.add(Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_big_box.get(/*~~suyskk~~*/(opcion_entero - 1) / 2).get(/*~~onwkds~~*/(opcion_entero - 1) % 2))
            precios_menu_selecionados_temp.add(precio_seleccionado)
            cantidades_menu_seleccionados_temp.add(cantidad_producto)
            Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_seleccionados.addAll(menu_seleccionados_temp)
            Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_menu_selecionados.addAll(precios_menu_selecionados_temp)

        } else {
            println("opción no válida.")
        }
        println("¿Cuántas unidades desea comprar?")
        cantidad_producto = wali.nextInt()
        cantidades_menu_seleccionados_temp.add(cantidad_producto)
        Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.cantidades_menu_seleccionados.add(cantidad_producto)
        wali.nextLine()
        println("¿Desea añadir algún complemento?")
        for (i in Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_complementos.indices)  {
             var fila: /*@@exbisg@@*/kotlin.Array</*@@saefkl@@*/kotlin.String?>? = Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_complementos.get(i)
            java.lang.System.out.printf("%-50s%-50s%-50s%n", fila.get(0), fila.get(1), fila.get(2))
        }
         var opcion_complementos: /*@@nexomt@@*/Int
        while (/*~~mrkqkk~~*/(wali.nextInt().also({ opcion_complementos = it })) != 0) {
            if (opcion_complementos > 0 && opcion_complementos <= Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_complementos.size) {
                complementos_seleccionados_temp.add(Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_complementos.get(/*~~ixvjdk~~*/(opcion_complementos - 1) / 3).get(/*~~adjppi~~*/(opcion_complementos - 1) % 3))
                precios_complementos_seleccionados_temp.add(Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_complementos.get(opcion_complementos - 1))
                Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.complementos_seleccionados.addAll(complementos_seleccionados_temp)
                Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_complementos_seleccionados.addAll(precios_complementos_seleccionados_temp)
            } else {
                println("Opción no válida.")
            }
            println("Ingrese el número del complemento que desea agregar ( 0 para terminar):")
        }
        wali.nextLine()
         var totalPedido: /*@@fqxkie@@*/kotlin.Double = Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.pedido(cantidad_producto, precio_seleccionado, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_complementos_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_promociones_selecionadas)
        Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.informacion_pedido(totalPedido, menu_seleccionados_temp, cantidad_producto, complementos_seleccionados_temp, precios_menu_selecionados_temp, precios_complementos_seleccionados_temp)
        println("desea añadirlo a su carrito? (SI/NO)")
        opcion = wali.nextLine()
        if (opcion.equals("si", ignoreCase = true)) {
            println("desea:")
            println("1.- seguir comprando(volver al menu)")
            println("2.- realizar el pago su pedido")
            println("3.- ver su carrito")
            println("4.- volver a la pagina principal")
            opcion = wali.nextLine()
            when(opcion){"1" -> Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_principal()
                "2" -> {
                    println(" ")
                    Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.carrito(Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.cantidades_menu_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_complementos_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_menu_selecionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.complementos_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.promociones_selecionadas, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_promociones_selecionadas, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.cantidades_promociones_seleccionados)
                }
                "3" -> Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.carrito(Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.cantidades_menu_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_complementos_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_menu_selecionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.complementos_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.promociones_selecionadas, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_promociones_selecionadas, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.cantidades_promociones_seleccionados)
                "4" -> Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.pagina_principal()
            }} else {
            println("desea realizar el pago de su pedido? (SI/NO)")
            opcion = wali.nextLine()
            if (opcion.equals("si", ignoreCase = true)) {
                Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.carrito(Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.cantidades_menu_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_complementos_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_menu_selecionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.complementos_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.promociones_selecionadas, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_promociones_selecionadas, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.cantidades_promociones_seleccionados)
            } else {
                println("su pedido se a cancelado")
                println("No, nos dejes, deseaa..")
                println("1.- volver al menu principal")
                println("2.- volver a la pagina principal")
                println("3.- salir")
                opcion = wali.nextLine()
                when(opcion){"1" -> Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_principal()
                    "3" -> {
                        println("gracias por visitar la pagina de KFC")
                        println("esperamos, que vuelva pronto")
                    }}}
        }
    }
     ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     fun /*@@bhscjg@@*/seleccionacion_menu_combos(wali:/*@@ezhkkp@@*/java.util.Scanner?) {
         var precios_complementos_seleccionados_temp: /*@@uoypwp@@*/kotlin.collections.MutableList</*@@anfmpc@@*/kotlin.Double?>? = java.util.ArrayList</*@@glgcnj@@*/kotlin.Double?>()
         var precios_menu_selecionados_temp: /*@@hxporq@@*/kotlin.collections.MutableList</*@@gcxfey@@*/kotlin.Double?>? = java.util.ArrayList</*@@xwwzyn@@*/kotlin.Double?>()
         var menu_seleccionados_temp: /*@@qksudz@@*/kotlin.collections.MutableList</*@@rzmihe@@*/kotlin.String?>? = java.util.ArrayList</*@@zgzrgp@@*/kotlin.String?>()
         var complementos_seleccionados_temp: /*@@hqytid@@*/kotlin.collections.MutableList</*@@lyckug@@*/kotlin.String?>? = java.util.ArrayList</*@@ozpexg@@*/kotlin.String?>()
         var cantidades_menu_seleccionados_temp: /*@@cfifln@@*/kotlin.collections.MutableList</*@@hulfbw@@*/Int?>? = java.util.ArrayList</*@@bzhbzv@@*/Int?>()
         var precio_seleccionado: /*@@fqxkie@@*/kotlin.Double = 0.0
         var cantidad_producto: /*@@nexomt@@*/Int = 0

        for (fila:/*@@hloise@@*/kotlin.Array</*@@tmlqug@@*/kotlin.String?>? in Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_combos)  {
            java.lang.System.out.printf("%-50s%-50s%n", fila.get(0), fila.get(1))
        }
        println("Seleccione una opción")
         var opcion: /*@@nmwiqh@@*/kotlin.String? = wali.nextLine()
         var opcion_entero: /*@@nexomt@@*/Int = opcion.toInt()
        if (opcion_entero >= 1 && opcion_entero <= Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precio_combos.size) {
            println("Seleccionó " + Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_combos.get(/*~~fjdutd~~*/(opcion_entero - 1) / 2).get(/*~~xrqird~~*/(opcion_entero - 1) % 2))
            precio_seleccionado = Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precio_combos.get(opcion_entero - 1)
            menu_seleccionados_temp.add(Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_combos.get(/*~~dbulyc~~*/(opcion_entero - 1) / 2).get(/*~~lbqiih~~*/(opcion_entero - 1) % 2))
            precios_menu_selecionados_temp.add(precio_seleccionado)
            cantidades_menu_seleccionados_temp.add(cantidad_producto)
            Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_seleccionados.addAll(menu_seleccionados_temp)
            Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_menu_selecionados.addAll(precios_menu_selecionados_temp)

        } else {
            println("opción no válida.")
        }
        println("¿Cuántas unidades desea comprar?")
        cantidad_producto = wali.nextInt()
        cantidades_menu_seleccionados_temp.add(cantidad_producto)
        Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.cantidades_menu_seleccionados.add(cantidad_producto)
        wali.nextLine()
        println("¿Desea añadir algún complemento?")
        for (i in Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_complementos.indices)  {
             var fila: /*@@frentu@@*/kotlin.Array</*@@qkdyit@@*/kotlin.String?>? = Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_complementos.get(i)
            java.lang.System.out.printf("%-50s%-50s%-50s%n", fila.get(0), fila.get(1), fila.get(2))
        }
         var opcion_complementos: /*@@nexomt@@*/Int
        while (/*~~yaswue~~*/(wali.nextInt().also({ opcion_complementos = it })) != 0) {
            if (opcion_complementos > 0 && opcion_complementos <= Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_complementos.size) {
                complementos_seleccionados_temp.add(Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_complementos.get(/*~~lfoiei~~*/(opcion_complementos - 1) / 3).get(/*~~fsnhog~~*/(opcion_complementos - 1) % 3))
                precios_complementos_seleccionados_temp.add(Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_complementos.get(opcion_complementos - 1))
                Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.complementos_seleccionados.addAll(complementos_seleccionados_temp)
                Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_complementos_seleccionados.addAll(precios_complementos_seleccionados_temp)
            } else {
                println("Opción no válida.")
            }
            println("Ingrese el número del complemento que desea agregar ( 0 para terminar):")
        }
        wali.nextLine()
         var totalPedido: /*@@fqxkie@@*/kotlin.Double = Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.pedido(cantidad_producto, precio_seleccionado, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_complementos_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_promociones_selecionadas)
        Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.informacion_pedido(totalPedido, menu_seleccionados_temp, cantidad_producto, complementos_seleccionados_temp, precios_menu_selecionados_temp, precios_complementos_seleccionados_temp)
        println("desea añadirlo a su carrito? (SI/NO)")
        opcion = wali.nextLine()
        if (opcion.equals("si", ignoreCase = true)) {
            println("desea:")
            println("1.- seguir comprando(volver al menu)")
            println("2.- realizar el pago su pedido")
            println("3.- ver su carrito")
            println("4.- volver a la pagina principal")
            opcion = wali.nextLine()
            when(opcion){"1" -> Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_principal()
                "2" -> {
                    println(" ")
                    Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.carrito(Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.cantidades_menu_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_complementos_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_menu_selecionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.complementos_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.promociones_selecionadas, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_promociones_selecionadas, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.cantidades_promociones_seleccionados)
                }
                "3" -> Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.carrito(Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.cantidades_menu_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_complementos_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_menu_selecionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.complementos_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.promociones_selecionadas, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_promociones_selecionadas, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.cantidades_promociones_seleccionados)
                "4" -> Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.pagina_principal()
            }} else {
            println("desea realizar el pago de su pedido? (SI/NO)")
            opcion = wali.nextLine()
            if (opcion.equals("si", ignoreCase = true)) {
                Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.carrito(Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.cantidades_menu_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_complementos_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_menu_selecionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.complementos_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.promociones_selecionadas, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_promociones_selecionadas, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.cantidades_promociones_seleccionados)
            } else {
                println("su pedido se a cancelado")
                println("No, nos dejes, deseaa..")
                println("1.- volver al menu principal")
                println("2.- volver a la pagina principal")
                println("3.- salir")
                opcion = wali.nextLine()
                when(opcion){"1" -> Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_principal()
                    "3" -> {
                        println("gracias por visitar la pagina de KFC")
                        println("esperamos, que vuelva pronto")
                    }}}
        }
    }
     ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     fun /*@@hzilhr@@*/seleccionacion_menu_sandwiches_tostados(wali:/*@@ezhkkp@@*/java.util.Scanner?) {
         var precios_complementos_seleccionados_temp: /*@@xlsxer@@*/kotlin.collections.MutableList</*@@lndyfb@@*/kotlin.Double?>? = java.util.ArrayList</*@@cmskem@@*/kotlin.Double?>()
         var precios_menu_selecionados_temp: /*@@wtdiby@@*/kotlin.collections.MutableList</*@@zcmnbx@@*/kotlin.Double?>? = java.util.ArrayList</*@@amvcnv@@*/kotlin.Double?>()
         var menu_seleccionados_temp: /*@@yekxwo@@*/kotlin.collections.MutableList</*@@pwaojy@@*/kotlin.String?>? = java.util.ArrayList</*@@iwkgxr@@*/kotlin.String?>()
         var complementos_seleccionados_temp: /*@@mqldsd@@*/kotlin.collections.MutableList</*@@holjjy@@*/kotlin.String?>? = java.util.ArrayList</*@@baqpub@@*/kotlin.String?>()
         var cantidades_menu_seleccionados_temp: /*@@spzubg@@*/kotlin.collections.MutableList</*@@jpkuxp@@*/Int?>? = java.util.ArrayList</*@@vqjhxx@@*/Int?>()
         var precio_seleccionado: /*@@fqxkie@@*/kotlin.Double = 0.0
         var cantidad_producto: /*@@nexomt@@*/Int = 0

        for (fila:/*@@iiovww@@*/kotlin.Array</*@@qjidlv@@*/kotlin.String?>? in Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_sandwich)  {
            java.lang.System.out.printf("%-50s%-50s%n", fila.get(0), fila.get(1))
        }
        println("Seleccione una opción")
         var opcion: /*@@qikwox@@*/kotlin.String? = wali.nextLine()
         var opcion_entero: /*@@nexomt@@*/Int = opcion.toInt()
        if (opcion_entero >= 1 && opcion_entero <= Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precio_sandwich.size) {
            println("Seleccionó " + Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_sandwich.get(/*~~hrdigu~~*/(opcion_entero - 1) / 2).get(/*~~jutakr~~*/(opcion_entero - 1) % 2))
            precio_seleccionado = Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precio_sandwich.get(opcion_entero - 1)
            menu_seleccionados_temp.add(Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_sandwich.get(/*~~ohvjae~~*/(opcion_entero - 1) / 2).get(/*~~pinkbg~~*/(opcion_entero - 1) % 2))
            precios_menu_selecionados_temp.add(precio_seleccionado)
            cantidades_menu_seleccionados_temp.add(cantidad_producto)
            Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_seleccionados.addAll(menu_seleccionados_temp)
            Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_menu_selecionados.addAll(precios_menu_selecionados_temp)

        } else {
            println("opción no válida.")
        }
        println("¿Cuántas unidades desea comprar?")
        cantidad_producto = wali.nextInt()
        cantidades_menu_seleccionados_temp.add(cantidad_producto)
        Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.cantidades_menu_seleccionados.add(cantidad_producto)
        wali.nextLine()
        println("¿Desea añadir algún complemento?")
        for (i in Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_complementos.indices)  {
             var fila: /*@@khcemk@@*/kotlin.Array</*@@zdmsin@@*/kotlin.String?>? = Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_complementos.get(i)
            java.lang.System.out.printf("%-50s%-50s%-50s%n", fila.get(0), fila.get(1), fila.get(2))
        }
         var opcion_complementos: /*@@nexomt@@*/Int
        while (/*~~szawxb~~*/(wali.nextInt().also({ opcion_complementos = it })) != 0) {
            if (opcion_complementos > 0 && opcion_complementos <= Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_complementos.size) {
                complementos_seleccionados_temp.add(Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_complementos.get(/*~~npavhr~~*/(opcion_complementos - 1) / 3).get(/*~~mmmhyp~~*/(opcion_complementos - 1) % 3))
                precios_complementos_seleccionados_temp.add(Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_complementos.get(opcion_complementos - 1))
                Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.complementos_seleccionados.addAll(complementos_seleccionados_temp)
                Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_complementos_seleccionados.addAll(precios_complementos_seleccionados_temp)
            } else {
                println("Opción no válida.")
            }
            println("Ingrese el número del complemento que desea agregar ( 0 para terminar):")
        }
        wali.nextLine()
         var totalPedido: /*@@fqxkie@@*/kotlin.Double = Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.pedido(cantidad_producto, precio_seleccionado, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_complementos_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_promociones_selecionadas)
        Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.informacion_pedido(totalPedido, menu_seleccionados_temp, cantidad_producto, complementos_seleccionados_temp, precios_menu_selecionados_temp, precios_complementos_seleccionados_temp)
        println("desea añadirlo a su carrito? (SI/NO)")
        opcion = wali.nextLine()
        if (opcion.equals("si", ignoreCase = true)) {
            println("desea:")
            println("1.- seguir comprando(volver al menu)")
            println("2.- realizar el pago su pedido")
            println("3.- ver su carrito")
            println("4.- volver a la pagina principal")
            opcion = wali.nextLine()
            when(opcion){"1" -> Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_principal()
                "2" -> {
                    println(" ")
                    Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.carrito(Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.cantidades_menu_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_complementos_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_menu_selecionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.complementos_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.promociones_selecionadas, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_promociones_selecionadas, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.cantidades_promociones_seleccionados)
                }
                "3" -> Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.carrito(Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.cantidades_menu_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_complementos_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_menu_selecionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.complementos_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.promociones_selecionadas, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_promociones_selecionadas, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.cantidades_promociones_seleccionados)
                "4" -> Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.pagina_principal()
            }} else {
            println("desea realizar el pago de su pedido? (SI/NO)")
            opcion = wali.nextLine()
            if (opcion.equals("si", ignoreCase = true)) {
                Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.carrito(Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.cantidades_menu_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_complementos_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_menu_selecionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.complementos_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.promociones_selecionadas, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_promociones_selecionadas, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.cantidades_promociones_seleccionados)
            } else {
                println("su pedido se a cancelado")
                println("No, nos dejes, deseaa..")
                println("1.- volver al menu principal")
                println("2.- volver a la pagina principal")
                println("3.- salir")
                opcion = wali.nextLine()
                when(opcion){"1" -> Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_principal()
                    "3" -> {
                        println("gracias por visitar la pagina de KFC")
                        println("esperamos, que vuelva pronto")
                    }}}
        }
    }
     ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     fun /*@@ueisvy@@*/menu_promociones(wali:/*@@ezhkkp@@*/java.util.Scanner?, menu_promociones:/*@@pihpfo@@*/kotlin.Array</*@@wtczyt@@*/kotlin.Array</*@@hxsdht@@*/kotlin.String?>?>?, precios_promociones:/*@@ebbsqa@@*/kotlin.DoubleArray?) {
         var promociones_selecionadas_temp: /*@@nrhbfs@@*/kotlin.collections.MutableList</*@@qlkhzd@@*/kotlin.String?>? = java.util.ArrayList</*@@irnosd@@*/kotlin.String?>()
         var precios_promociones_selecionadas_temp: /*@@tinmxe@@*/kotlin.collections.MutableList</*@@nqnjqp@@*/kotlin.Double?>? = java.util.ArrayList</*@@rwcyne@@*/kotlin.Double?>()
         var cantidades_promociones_seleccionados_temp: /*@@kpdelc@@*/kotlin.collections.MutableList</*@@gulboj@@*/Int?>? = java.util.ArrayList</*@@nobout@@*/Int?>()
         var complementos_seleccionados_temp: /*@@rchysr@@*/kotlin.collections.MutableList</*@@cgqtet@@*/kotlin.String?>? = java.util.ArrayList</*@@kynzle@@*/kotlin.String?>()
         var precios_complementos_seleccionados_temp: /*@@wophnj@@*/kotlin.collections.MutableList</*@@khirzt@@*/kotlin.Double?>? = java.util.ArrayList</*@@jijzgx@@*/kotlin.Double?>()
         var precio_seleccionado: /*@@fqxkie@@*/kotlin.Double = 0.0
         var cantidad_producto: /*@@nexomt@@*/Int = 0
        for (fila:/*@@oiymlf@@*/kotlin.Array</*@@fdylta@@*/kotlin.String?>? in menu_promociones)  {
            java.lang.System.out.printf("%-50s%-50s%n", fila.get(0), fila.get(1))
        }
        println("seleccione una opcion:")
         var opcion: /*@@zxfqww@@*/kotlin.String? = wali.nextLine()
         var opcion_entero: /*@@nexomt@@*/Int = opcion.toInt()
        if (opcion_entero >= 1 && opcion_entero <= precios_promociones.size) {
            println("Seleccionó " + menu_promociones.get(/*~~mvgbne~~*/(opcion_entero - 1) / 2).get(/*~~eebffz~~*/(opcion_entero - 1) % 2))
            precio_seleccionado = precios_promociones.get(opcion_entero - 1)
            promociones_selecionadas_temp.add(menu_promociones.get(/*~~fsztft~~*/(opcion_entero - 1) / 2).get(/*~~dwoqyw~~*/(opcion_entero - 1) % 2))
            precios_promociones_selecionadas_temp.add(precio_seleccionado)
            Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.promociones_selecionadas.addAll(promociones_selecionadas_temp)
            Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_promociones_selecionadas.addAll(precios_promociones_selecionadas_temp)
        } else {
            println("opcion no valida")
        }
        println("¿Cuántas unidades desea comprar?")
        cantidad_producto = wali.nextInt()
        cantidades_promociones_seleccionados_temp.add(cantidad_producto)
        Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.cantidades_promociones_seleccionados.add(cantidad_producto)
        wali.nextLine()
        println("¿Desea añadir algún complemento?")
        for (i in Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_complementos.indices)  {
             var fila: /*@@ogwjyd@@*/kotlin.Array</*@@jdsfaz@@*/kotlin.String?>? = Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_complementos.get(i)
            java.lang.System.out.printf("%-50s%-50s%-50s%n", fila.get(0), fila.get(1), fila.get(2))
        }
         var opcion_complementos: /*@@nexomt@@*/Int
        while (/*~~jiotas~~*/(wali.nextInt().also({ opcion_complementos = it })) != 0) {
            if (opcion_complementos > 0 && opcion_complementos <= Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_complementos.size) {
                complementos_seleccionados_temp.add(Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_complementos.get(/*~~jxekvz~~*/(opcion_complementos - 1) / 3).get(/*~~qcawsp~~*/(opcion_complementos - 1) % 3))
                precios_complementos_seleccionados_temp.add(Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_complementos.get(opcion_complementos - 1))
                Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.complementos_seleccionados.addAll(complementos_seleccionados_temp)
                Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_complementos_seleccionados.addAll(precios_complementos_seleccionados_temp)
            } else {
                println("Opción no válida.")
            }
            println("Ingrese el número del complemento que desea agregar ( 0 para terminar):")
        }
        wali.nextLine()
         var totalPedido: /*@@fqxkie@@*/kotlin.Double = Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.pedido(cantidad_producto, precio_seleccionado, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_complementos_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_promociones_selecionadas)
        Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.informacion_pedido_promociones(totalPedido, cantidad_producto, complementos_seleccionados_temp, precios_complementos_seleccionados_temp, promociones_selecionadas_temp, precios_promociones_selecionadas_temp)
        println("desea añadirlo a su carrito? (SI/NO)")
        opcion = wali.nextLine()
        if (opcion.equals("si", ignoreCase = true)) {
            println("desea:")
            println("1.- seguir comprando(volver al menu)")
            println("2.- ralizar el pago su pedido")
            println("3.- ver su carrito")
            opcion = wali.nextLine()
            when(opcion){"1" -> Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_principal()
                "2" -> {
                    println(" ")
                    Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.carrito(Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.cantidades_menu_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_complementos_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_menu_selecionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.complementos_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.promociones_selecionadas, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_promociones_selecionadas, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.cantidades_promociones_seleccionados)
                }
                "3" -> Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.carrito(Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.cantidades_menu_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_complementos_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_menu_selecionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.complementos_seleccionados, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.promociones_selecionadas, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_promociones_selecionadas, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.cantidades_promociones_seleccionados)
            }} else {
            println("desea realizar el pago de su pedido? (SI/NO)")
            opcion = wali.nextLine()
            if (opcion.equals("si", ignoreCase = true)) {
                Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.metodo_de_pago()
            } else {
                println("su pedido se a cancelado")
                println("No, nos dejes, deseaa..")
                println("1.- volver al menu principal")
                println("2.- salir")
                opcion = wali.nextLine()
                when(opcion){"1" -> Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_principal()
                    "2" -> {
                        println("gracias por visitar la pagina de KFC")
                        println("esperamos, que vuelva pronto")
                    }}}
        }
    }
     ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     fun /*@@teyaau@@*/pedido(cantidad_de_producto:/*@@nexomt@@*/Int, precio_seleccionado:/*@@fqxkie@@*/kotlin.Double, precios_complementos_seleccionados_temp:/*@@kjegch@@*/kotlin.collections.MutableList</*@@xzuuwq@@*/kotlin.Double?>?, precios_promociones_selecionadas_temp:/*@@enbzyj@@*/kotlin.collections.MutableList</*@@yehxff@@*/kotlin.Double?>?): /*@@fqxkie@@*/kotlin.Double {
         var preciocomplementario: /*@@fqxkie@@*/kotlin.Double = 0.0
        for (precio:/*@@fqxkie@@*/kotlin.Double in precios_complementos_seleccionados_temp)  {
            preciocomplementario += precio
        }
        for (precio_promociones:/*@@fqxkie@@*/kotlin.Double in precios_promociones_selecionadas_temp)  {
            preciocomplementario += precio_promociones
        }
         var pre_total: /*@@fqxkie@@*/kotlin.Double = /*~~eehywc~~*/(precio_seleccionado * cantidad_de_producto)
        return pre_total
    }

     fun /*@@czkfzv@@*/informacion_pedido(pre_total:/*@@fqxkie@@*/kotlin.Double, menu_seleccionados_temp:/*@@rdwfad@@*/kotlin.collections.MutableList</*@@smyvlz@@*/kotlin.String?>?, cantidad_de_producto:/*@@nexomt@@*/Int, menu_complementos_temp:/*@@jjaraa@@*/kotlin.collections.MutableList</*@@tecjgk@@*/kotlin.String?>?, precios_menu_selecionados_temp:/*@@kddjuf@@*/kotlin.collections.MutableList</*@@qdvmjq@@*/kotlin.Double?>?, precios_complementos_seleccionados_temp:/*@@bdtbwo@@*/kotlin.collections.MutableList</*@@sekxil@@*/kotlin.Double?>?) {
        for (i in menu_seleccionados_temp.indices)  {
            println("Menu: " + menu_seleccionados_temp.get(i))
        }

        println("Cantidad de producto: " + cantidad_de_producto)
        println("precio total de menu: S/" + pre_total)
         var total_complementos: /*@@fqxkie@@*/kotlin.Double = 0.0
        for (i in menu_complementos_temp.indices)  {
             var complemento: /*@@utiihc@@*/kotlin.String? = menu_complementos_temp.get(i).split("\\.".toRegex()).dropLastWhile({it.isEmpty()}).toTypedArray().get(1)
            println("Complemento/Extras: " + complemento)
            total_complementos += precios_complementos_seleccionados_temp.get(i)
        }
        println("Total de complementos: S/ " + total_complementos)
        println("Total de su pedido más complementos: S/ " + /*~~jptuqo~~*/(pre_total + total_complementos))
        menu_seleccionados_temp.clear()
        precios_menu_selecionados_temp.clear()
        menu_complementos_temp.clear()
        precios_complementos_seleccionados_temp.clear()
    }
     fun /*@@ulsppy@@*/informacion_pedido_promociones(pre_total:/*@@fqxkie@@*/kotlin.Double, cantidad_de_producto:/*@@nexomt@@*/Int, menu_complementos_temp:/*@@krjxtd@@*/kotlin.collections.MutableList</*@@rggrin@@*/kotlin.String?>?, precios_complementos_seleccionados_temp:/*@@rxcsus@@*/kotlin.collections.MutableList</*@@zhuhwc@@*/kotlin.Double?>?, promociones_selecionadas_temp:/*@@xlptvw@@*/kotlin.collections.MutableList</*@@wzktlc@@*/kotlin.String?>?, precios_promociones_selecionadas_temp:/*@@nlgext@@*/kotlin.collections.MutableList</*@@smfxzs@@*/kotlin.Double?>?) {
        for (i in promociones_selecionadas_temp.indices)  {
            println("MENU (PROMOCIONES): " + promociones_selecionadas_temp.get(i))
        }
        println("Cantidad de producto: " + cantidad_de_producto)
        println("precio total de menu: S/" + pre_total)
         var total_complementos: /*@@fqxkie@@*/kotlin.Double = 0.0
        for (i in menu_complementos_temp.indices)  {
             var complemento: /*@@fadzyr@@*/kotlin.String? = menu_complementos_temp.get(i).split("\\.".toRegex()).dropLastWhile({it.isEmpty()}).toTypedArray().get(1)
            println("Complemento/Extras: " + complemento)
            total_complementos += precios_complementos_seleccionados_temp.get(i)
        }
        println("Total de complementos: S/ " + total_complementos)
        println("Total de su pedido más complementos: S/ " + /*~~illnsw~~*/(pre_total + total_complementos))
        menu_complementos_temp.clear()
        precios_complementos_seleccionados_temp.clear()
        precios_promociones_selecionadas_temp.clear()
        promociones_selecionadas_temp.clear()
    }
     fun /*@@hwvisx@@*/carrito(cantidades_menu_seleccionados:/*@@slyxjl@@*/kotlin.collections.MutableList</*@@vfyscw@@*/Int?>?, precios_complementos_seleccionados:/*@@eophjo@@*/kotlin.collections.MutableList</*@@jvzkqj@@*/kotlin.Double?>?, precios_menu_selecionados:/*@@ffoolt@@*/kotlin.collections.MutableList</*@@jddejb@@*/kotlin.Double?>?, menu_seleccionados:/*@@lkoklj@@*/kotlin.collections.MutableList</*@@upluxb@@*/kotlin.String?>?, complementos_seleccionados:/*@@xothjj@@*/kotlin.collections.MutableList</*@@xchrpm@@*/kotlin.String?>?, promociones_selecionadas:/*@@rcwkzk@@*/kotlin.collections.MutableList</*@@hritqx@@*/kotlin.String?>?, precios_promociones_selecionadas:/*@@ftdmlv@@*/kotlin.collections.MutableList</*@@ayzhrz@@*/kotlin.Double?>?, cantidades_promociones_seleccionados:/*@@pmpctp@@*/kotlin.collections.MutableList</*@@ezbzpa@@*/Int?>?) {
         var wali: /*@@ezhkkp@@*/java.util.Scanner? = java.util.Scanner(java.lang.System.`in`)
         var total_precio: /*@@fqxkie@@*/kotlin.Double = 0.0
         var total_menu: /*@@fqxkie@@*/kotlin.Double = 0.0
         var precio_promociones: /*@@fqxkie@@*/kotlin.Double = 0.0
         var total_promociones: /*@@fqxkie@@*/kotlin.Double = 0.0
        println("╔══════════════════════════════════════════════════════════════╗")
        println("                      Detalles del carrito:")
        println("├──────────────────────────────────────────────────────────────┤")
        println("  Número de menús seleccionados: " + menu_seleccionados.size)
        println("──────────────────────────────────────────────────────────────")
        for (i in menu_seleccionados.indices)  {
             var menus: /*@@qharyk@@*/kotlin.String? = menu_seleccionados.get(i).split("\\.".toRegex()).dropLastWhile({it.isEmpty()}).toTypedArray().get(1)
            println("──────────────────────────────────────────────────────────────")
            println("  MENU: " + menus)
            println("--------------------------------------------------------------")
            println("  Cantidad de menú seleccionado: " + cantidades_menu_seleccionados.get(i))
            println("--------------------------------------------------------------")
            total_precio += precios_menu_selecionados.get(i) * cantidades_menu_seleccionados.get(i)
            total_menu = precios_menu_selecionados.get(i) * cantidades_menu_seleccionados.get(i)
            println("  total de menu. S/. " + total_menu)
            println("──────────────────────────────────────────────────────────────")
        }
        println("├──────────────────────────────────────────────────────────────┤")
        println("  Número de menús (promociones) seleccionados: " + promociones_selecionadas.size)
        println("──────────────────────────────────────────────────────────────")
        for (i in promociones_selecionadas.indices)  {
             var menuss: /*@@jzcekl@@*/kotlin.String? = promociones_selecionadas.get(i).split("\\.".toRegex()).dropLastWhile({it.isEmpty()}).toTypedArray().get(1)
            println("──────────────────────────────────────────────────────────────")
            println("  MENU (promociones): " + menuss)
            println("--------------------------------------------------------------")
            println("  Cantidad de menú seleccionado: " + cantidades_promociones_seleccionados.get(i))
            println("--------------------------------------------------------------")
            precio_promociones += precios_promociones_selecionadas.get(i) * cantidades_promociones_seleccionados.get(i)
            total_promociones = precios_promociones_selecionadas.get(i) * cantidades_promociones_seleccionados.get(i)
            println("  total de menu (promociones). S/. " + total_promociones)
            total_precio += precio_promociones
            println("──────────────────────────────────────────────────────────────")
        }
        println("├──────────────────────────────────────────────────────────────┤")
        println("  Complementos seleccionados:")
        println("──────────────────────────────────────────────────────────────")
        for (i in complementos_seleccionados.indices)  {
             var complemento: /*@@ihivpd@@*/kotlin.String? = complementos_seleccionados.get(i).split("\\.".toRegex()).dropLastWhile({it.isEmpty()}).toTypedArray().get(1)
            println("--------------------------------------------------------------")
            println("  Complemento/Extras: " + complemento)
            println("--------------------------------------------------------------")
            total_precio += precios_complementos_seleccionados.get(i)
        }
        println("──────────────────────────────────────────────────────────────")
        println("╚══════════════════════════════════════════════════════════════╝")
        println("  Total de compra(menu): S/ " + total_precio)
        println("──────────────────────────────────────────────────────────────")
         var ivg_total: /*@@fqxkie@@*/kotlin.Double = total_precio * Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.igv
        println("IGV : S/ " + ivg_total)
        println("──────────────────────────────────────────────────────────────")
        println("SU TOTAL DE COMPRA(PEDIDO) ES: " + /*~~buncyb~~*/(ivg_total + total_precio))
        println("════════════════════════════════════════════════════════════════")
        println("PRECIONE ENTER PARA CONTINUAR; ")
        wali.nextLine()
         var opcion: /*@@vsvldw@@*/kotlin.String?
        println("1.- realizar el pago de su carrito")
        println("2.- volver al menu principal")
        println("3.- volver a la pagina principal")
        opcion = wali.nextLine()
        when(opcion){"1" -> {
                println("elija un metodo de entrega ")
                println("metodo de entrega disponibles; ")
                println("1.- delivery mas (S/ 10)")
                println("2.- recojo en tienda (S/ 0)")
                opcion = wali.nextLine()
                when(opcion){"1" -> {
                        println("╔══════════════════════════════════════════════════════════════╗")
                        println("                 DETALLES DE CARRITO ACTUALIZADO:")
                        println("├──────────────────────────────────────────────────────────────┤")
                        println("  Número de menús seleccionados: " + menu_seleccionados.size)
                        println("──────────────────────────────────────────────────────────────")
                        run({ var i: /*@@nexomt@@*/Int = 0
                        while (i < menu_seleccionados.size) {
                             var menus: /*@@cehwth@@*/kotlin.String? = menu_seleccionados.get(i).split("\\.".toRegex()).dropLastWhile({it.isEmpty()}).toTypedArray().get(1)
                            println("──────────────────────────────────────────────────────────────")
                            println("  MENU: " + menus)
                            println("--------------------------------------------------------------")
                            println("  Cantidad de menú seleccionado: " + cantidades_menu_seleccionados.get(i))
                            println("--------------------------------------------------------------")
                            total_precio += precios_menu_selecionados.get(i) * cantidades_menu_seleccionados.get(i)
                            total_menu = precios_menu_selecionados.get(i) * cantidades_menu_seleccionados.get(i)
                            println("  total de menu. S/. " + total_menu)
                            println("──────────────────────────────────────────────────────────────")
                            i++}})
                        println("├──────────────────────────────────────────────────────────────┤")
                        println("  Número de menús (promociones) seleccionados: " + promociones_selecionadas.size)
                        println("──────────────────────────────────────────────────────────────")
                        run({ var i: /*@@nexomt@@*/Int = 0
                        while (i < promociones_selecionadas.size) {
                             var menuss: /*@@zwktyi@@*/kotlin.String? = promociones_selecionadas.get(i).split("\\.".toRegex()).dropLastWhile({it.isEmpty()}).toTypedArray().get(1)
                            println("──────────────────────────────────────────────────────────────")
                            println("  MENU (promociones): " + menuss)
                            println("--------------------------------------------------------------")
                            println("  Cantidad de menú seleccionado: " + cantidades_promociones_seleccionados.get(i))
                            println("--------------------------------------------------------------")
                            precio_promociones += precios_promociones_selecionadas.get(i) * cantidades_promociones_seleccionados.get(i)
                            total_promociones = precios_promociones_selecionadas.get(i) * cantidades_promociones_seleccionados.get(i)
                            println("  total de menu (promociones). S/. " + total_promociones)
                            total_precio += precio_promociones
                            println("──────────────────────────────────────────────────────────────")
                            i++}})
                        println("├──────────────────────────────────────────────────────────────┤")
                        println("  Complementos seleccionados:")
                        println("──────────────────────────────────────────────────────────────")
                        run({ var i: /*@@nexomt@@*/Int = 0
                        while (i < complementos_seleccionados.size) {
                             var complemento: /*@@jiplom@@*/kotlin.String? = complementos_seleccionados.get(i).split("\\.".toRegex()).dropLastWhile({it.isEmpty()}).toTypedArray().get(1)
                            println("--------------------------------------------------------------")
                            println("  Complemento/Extras: " + complemento)
                            println("--------------------------------------------------------------")
                            total_precio += precios_complementos_seleccionados.get(i)
                            i++}})
                        println("──────────────────────────────────────────────────────────────")
                        println("╚══════════════════════════════════════════════════════════════╝")
                        println("  Total de compra(menu): S/ " + total_precio)
                        println("──────────────────────────────────────────────────────────────")
                        ivg_total = total_precio * Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.igv
                        println("IGV : S/ " + ivg_total)
                         var delivery: /*@@nexomt@@*/Int = 10
                        println("──────────────────────────────────────────────────────────────")
                        println("DELIVERY (S/ 10): S/ " + delivery)
                        println("──────────────────────────────────────────────────────────────")
                        println("SU TOTAL DE COMPRA(PEDIDO) ES: " + /*~~jjydzs~~*/(ivg_total + total_precio + delivery))
                        println("════════════════════════════════════════════════════════════════")
                        println("PRECIONE ENTER PARA CONTINUAR:")
                        wali.nextLine()
                        println("SU DIRRECION ACTUAL ES: " + Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.direccion_selecioanda)
                        println("EN CUAL DE NUESTRAS DIRRECIONS SE UBICA")
                        println("ELIJA UNA DE NUESTRAS DIRRECIONES DE ENTREGA: ")
                         var i: /*@@nexomt@@*/Int = 0
                        while (i < Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.dirreciones_de_entrega.size) {
                            println(/*~~sgakmj~~*/(i + 1).toString() + ".- " + Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.dirreciones_de_entrega.get(i))
                            i++}
                        opcion = wali.nextLine()
                         var opcion_entera: /*@@nexomt@@*/Int = opcion.toInt()
                        when(opcion_entera){1 -> {
                                println("dirrecion selecionado: " + Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.dirreciones_de_entrega.get(opcion_entera - 1))

                                println("Su pedido llegara antes que se enfrie ")
                                println("  __")
                                println(" /|||\\`.__")
                                println("(   _    _ _\\")
                                println("=`-()--()-'")
                                println("     o  o")
                                println("--------------------")
                                Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.metodo_entrega = true
                                println("precione enter para realizar el pago:")
                                wali.nextLine()
                                Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.metodo_de_pago()
                                println("PRECIONE ENTER PARA VER SU FACTURA:")
                                wali.nextLine()
                                Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.factura(menu_seleccionados, cantidades_menu_seleccionados, precios_menu_selecionados, promociones_selecionadas, cantidades_promociones_seleccionados, precios_promociones_selecionadas, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.metodo_entrega, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.metodo_de_pago_seleccioando)
                            }
                            else -> {}}}
                    "2" -> {
                        println("╔══════════════════════════════════════════════════════════════╗")
                        println("                  DETALLES DE CARRITO ACTUALIZADO:")
                        println("├──────────────────────────────────────────────────────────────┤")
                        println("  Número de menús seleccionados: " + menu_seleccionados.size)
                        println("──────────────────────────────────────────────────────────────")
                        run({ var i: /*@@nexomt@@*/Int = 0
                        while (i < menu_seleccionados.size) {
                             var menus: /*@@bdgpim@@*/kotlin.String? = menu_seleccionados.get(i).split("\\.".toRegex()).dropLastWhile({it.isEmpty()}).toTypedArray().get(1)
                            println("──────────────────────────────────────────────────────────────")
                            println("  MENU: " + menus)
                            println("--------------------------------------------------------------")
                            println("  Cantidad de menú seleccionado: " + cantidades_menu_seleccionados.get(i))
                            println("--------------------------------------------------------------")
                            total_precio += precios_menu_selecionados.get(i) * cantidades_menu_seleccionados.get(i)
                            total_menu = precios_menu_selecionados.get(i) * cantidades_menu_seleccionados.get(i)
                            println("  total de menu. S/. " + total_menu)
                            println("──────────────────────────────────────────────────────────────")
                            i++}})
                        println("├──────────────────────────────────────────────────────────────┤")
                        println("  Número de menús (promociones) seleccionados: " + promociones_selecionadas.size)
                        println("──────────────────────────────────────────────────────────────")
                        run({ var i: /*@@nexomt@@*/Int = 0
                        while (i < promociones_selecionadas.size) {
                             var menuss: /*@@dbxscp@@*/kotlin.String? = promociones_selecionadas.get(i).split("\\.".toRegex()).dropLastWhile({it.isEmpty()}).toTypedArray().get(1)
                            println("──────────────────────────────────────────────────────────────")
                            println("  MENU (promociones): " + menuss)
                            println("--------------------------------------------------------------")
                            println("  Cantidad de menú seleccionado: " + cantidades_promociones_seleccionados.get(i))
                            println("--------------------------------------------------------------")
                            precio_promociones += precios_promociones_selecionadas.get(i) * cantidades_promociones_seleccionados.get(i)
                            total_promociones = precios_promociones_selecionadas.get(i) * cantidades_promociones_seleccionados.get(i)
                            println("  total de menu (promociones). S/. " + total_promociones)
                            total_precio += precio_promociones
                            println("──────────────────────────────────────────────────────────────")
                            i++}})
                        println("├──────────────────────────────────────────────────────────────┤")
                        println("  Complementos seleccionados:")
                        println("──────────────────────────────────────────────────────────────")
                         var i: /*@@nexomt@@*/Int = 0
                        while (i < complementos_seleccionados.size) {
                             var complemento: /*@@qzajtq@@*/kotlin.String? = complementos_seleccionados.get(i).split("\\.".toRegex()).dropLastWhile({it.isEmpty()}).toTypedArray().get(1)
                            println("--------------------------------------------------------------")
                            println("  Complemento/Extras: " + complemento)
                            println("--------------------------------------------------------------")
                            total_precio += precios_complementos_seleccionados.get(i)
                            i++}
                        println("──────────────────────────────────────────────────────────────")
                        println("╚══════════════════════════════════════════════════════════════╝")
                        println("  Total de compra(menu): S/ " + total_precio)
                        println("──────────────────────────────────────────────────────────────")
                        ivg_total = total_precio * Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.igv
                        println("IGV : S/ " + ivg_total)
                        println("──────────────────────────────────────────────────────────────")
                        println("SU TOTAL DE COMPRA(PEDIDO) ES: " + /*~~ccxusz~~*/(ivg_total + total_precio))
                        println("════════════════════════════════════════════════════════════════")
                        Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.metodo_entrega = false
                        println("precione enter para realizar el pago:")
                        wali.nextLine()
                        Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.metodo_de_pago()
                        println("PRECIONE ENTER PARA VER SU FACTURA:")
                        wali.nextLine()
                        Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.factura(menu_seleccionados, cantidades_menu_seleccionados, precios_menu_selecionados, promociones_selecionadas, cantidades_promociones_seleccionados, precios_promociones_selecionadas, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.metodo_entrega, Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.metodo_de_pago_seleccioando)
                    }}}
            "2" -> Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_principal()
            "3" -> Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.pagina_principal()
        }}
     fun /*@@xfkmkw@@*/iniciar_sesion() {
         var wali: /*@@ezhkkp@@*/java.util.Scanner? = java.util.Scanner(java.lang.System.`in`)
         var direccion: /*@@wllort@@*/kotlin.String?
         var op: /*@@gjupoa@@*/kotlin.String?
         var correo_valido: /*@@tdacjt@@*/kotlin.String?
         var contraseña_valida: /*@@jcmeab@@*/kotlin.String?
         var registro: /*@@fzoxrn@@*/kotlin.String?
         var contraeña: /*@@bijplg@@*/kotlin.String?
         var respuesta: /*@@wmxviw@@*/kotlin.String?
        respuesta = wali.nextLine()
        println("PARA COMONEZAR A REALIZAR PEDIDOS DEBE: (registrese/inicie sesion)")
        println("1.- REGISTRARSE")
        println("2.- INICIAR SESION")
        op = wali.nextLine()
        when(op){"1" -> if (!Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.registrarse) {
                println("REGISTRO:")
                println("registre su correo electronico:")
                registro = wali.nextLine()
                while (!registro.contains("@gmail.com")) {
                    println("Correo electrónico inválido, por favor vuelva a intentar :).")
                    registro = wali.nextLine()
                }
                Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.registro_de_usuarios.add(registro)
                println("cree su contraeña:")
                contraeña = wali.nextLine()
                Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.registro_de_contraseñas.add(contraeña)
                 var usuarios: /*@@bjpvno@@*/kotlin.Array</*@@oxuekx@@*/kotlin.String?>? = Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.registro_de_usuarios.toTypedArray</*@@cesfiz@@*/kotlin.String?>()
                 var contraseñas: /*@@mnfyem@@*/kotlin.Array</*@@mxlata@@*/kotlin.String?>? = Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.registro_de_contraseñas.toTypedArray</*@@tlmsir@@*/kotlin.String?>()
                println("INICIAR SESIÓN:")
                do  {
                    println("Ingrese su correo electrónico")
                    correo_valido = wali.nextLine()
                    println("Ingrese su contraseña: ")
                    contraseña_valida = wali.nextLine()
                     var i: /*@@nexomt@@*/Int = 0
                    while (i < Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.registro_de_usuarios.size) {
                        if ((correo_valido == Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.registro_de_usuarios.get(i)) && (contraseña_valida == Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.registro_de_contraseñas.get(i))) {
                            println("Inicio de sesión, ¡EXITOSO!")
                            Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.registrarse = true
                            Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.inicio_sesion = true
                            break
                        }
                        i++}
                    if (!Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.inicio_sesion) {
                        println("Inicio de sesión, ¡FALLIDO!")
                        println("Correo o contraseña incorrecta.")
                    }
                } while (!Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.registrarse)
                println("INGRESE SU DIRRECCION:")
                direccion = wali.nextLine().trim({it <= ' '})
                while (direccion.length <= 8) {
                    println("por favor, ingrese valida")
                    direccion = wali.nextLine().trim({it <= ' '})
                }
                println("DIRECCION GUARDADA CON ¡EXITO!: " + direccion)
                Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.direccion_selecioanda = direccion
                Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_principal()
            }
            "2" -> {
                 var usuarios: /*@@nubjda@@*/kotlin.Array</*@@zzmthf@@*/kotlin.String?>? = Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.registro_de_usuarios.toTypedArray</*@@udqxsw@@*/kotlin.String?>()
                 var contraseñas: /*@@bwnhea@@*/kotlin.Array</*@@bbiorx@@*/kotlin.String?>? = Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.registro_de_contraseñas.toTypedArray</*@@ecncrc@@*/kotlin.String?>()
                println("INICIAR SESIÓN:")
                println("ingrese su correo:")
                correo_valido = wali.nextLine()
                println("ingrese su contraseña:")
                contraseña_valida = wali.nextLine()
                 var i: /*@@nexomt@@*/Int = 0
                while (i < usuarios.size) {
                    if ((correo_valido == usuarios.get(i)) && (contraseña_valida == contraseñas.get(i))) {
                        println("Inicio de sesión, ¡EXITOSO!")
                        Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.registrarse = true
                    }
                    i++}
                Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_principal()
            }}}
     fun /*@@urrqxl@@*/metodo_de_pago() {
         var opcion: /*@@ezhkkp@@*/java.util.Scanner? = java.util.Scanner(java.lang.System.`in`)
         var op: /*@@nexomt@@*/Int
        println("SELECIONE POR CUAL METODO DE PAGO, VA A RELIZAR SU PAGO")
        println("1:   TERJETA VISA/MASTERCARD")
        println("2:   YAPE (SOLO NUMERO)")
        println("3:   CONTRA ENTREGA (EFECTIVO)")
        op = opcion.nextInt()
        when(op){1 -> Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.metodopago_tarjeta()
            2 -> Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.metodopago_yape()
            3 -> Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.metodopago_contraentrega()
        }}
    var tipo_de_tarjeta:/*@@hzrsgj@@*/Boolean = false
     fun /*@@fewwcx@@*/metodopago_tarjeta() {
         var metodo: /*@@zjdgbd@@*/kotlin.String?
         var fecha: /*@@yklrvo@@*/kotlin.String?
         var cvv: /*@@glbuix@@*/kotlin.String?
         var nombre: /*@@piplps@@*/kotlin.String?
         var confirmar: /*@@cxjaed@@*/kotlin.String?
         var volver: /*@@jqeaze@@*/kotlin.String?
         var volverr: /*@@ixumpv@@*/kotlin.String?
         var menu: /*@@wkowlk@@*/kotlin.String?
         var valida: /*@@hzrsgj@@*/Boolean
         var wali: /*@@ezhkkp@@*/java.util.Scanner? = java.util.Scanner(java.lang.System.`in`)
        do  {
            println("INGRESE EL NOMBRE Y APELLIDO DEL TITULAR DE LA TARJETA")
            nombre = wali.nextLine()
            println("INGRESE SU NUMERO DE TARJETA:  (1234 1234 1234 1234)")
            metodo = wali.nextLine().trim({it <= ' '})
            if (metodo.length != 19 || !metodo.matches("[4-5]\\d{3} \\d{4} \\d{4} \\d{4}".toRegex())) {
                println("Por favor, INGRESE SU NUMERO DE TARJETA TAL COMO SE MUESTRA EN SU TARJETA.")
            } else {
                if (metodo.startsWith("4")) {
                    println("Tarjeta tipo: Visa")
                    Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.tipo_de_tarjeta = true
                } else if (metodo.startsWith("5")) {
                    println("Tarjeta tipo: MasterCard")
                    Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.tipo_de_tarjeta = false
                }
                Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.metodo_de_pago_seleccioando += /*~~bglrlv~~*/(if (Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.tipo_de_tarjeta)" VISA" else " MASTERCARD")
            }
        } while (metodo.length != 19 || !metodo.matches("[4-5]\\d{3} \\d{4} \\d{4} \\d{4}".toRegex()))
        do  {
            println("INGRESE LA FECHA DE VENCIMIENTO DE SU TARJETA (MM/AAAA):")
            fecha = wali.nextLine().trim({it <= ' '})
            valida = fecha.matches("\\d{2}/\\d{4}".toRegex())
            if (valida) {
                 var partes: /*@@lznmuu@@*/kotlin.Array</*@@hioebd@@*/kotlin.String?>? = fecha.split("/".toRegex()).dropLastWhile({it.isEmpty()}).toTypedArray()
                 var mes: /*@@nexomt@@*/Int = partes.get(0).toInt()
                 var año: /*@@nexomt@@*/Int = partes.get(1).toInt()
                valida = /*~~budnyl~~*/(año >= 2024 && mes >= 6) && /*~~qtdisb~~*/(año <= 2035 && mes <= 12)
            }
            if (!valida) {
                println("Por favor, SU TARJETA VENCIÓ, VUELVE A INTENTAR O CAMBIE EL METODO DE PAGO.")
            }
        } while (!valida)
        do  {
            println("INGRESE SU CODIGO (CVV)")
            cvv = wali.nextLine().trim({it <= ' '})
            if (cvv.length != 3 || !cvv.matches("\\d{3}".toRegex())) {
                println("Por favor, CODIGO (CVV) INCORRECTO O NO COENCIDE CON LA TERJETA, VUELVE A INTENTAR.")
            }
        } while (cvv.length != 3 || !cvv.matches("\\d{3}".toRegex()))
        println("DESEA CONFIRMAR SU METODO DE PAGO:  (SI/NO)")
        confirmar = wali.nextLine()
        if ((confirmar == "si") || (confirmar == "SI")) {
            Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.metodo_de_pago_seleccioando = "TARJETA(CREDITO/DEBITO) "
            println("PAGO FUE REALIZADO CON EXITO")
            println("LA TRANSACCION FUE REALIZADA POR EL TITULAR: " + nombre)
            println("MONTO DESCONTADO A LA TARJETA: " + metodo + " -- " + fecha + " -- XXX")
            println("GRACIAS POR SU COMPRA")
            println("DESEA VOLVER AL MENU PRINCIPAL?? (SI/NO)")
            volver = wali.nextLine()
            if ((volver == "si") || (volver == "SI")) {
                println("MENU")
            }
        } else if ((confirmar == "no") || (confirmar == "NO")) {
            println("SU PAGO SE HA CANCELADO")
            println("¿DESEA CAMBIAR DE MÉTODO DE PAGO? (SI/NO)")
            volverr = wali.nextLine()
            if ((volverr == "si") || (volverr == "SI")) {
                Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.metodo_de_pago()
            } else {
                println("SU PEDIDO SE HA CANCELADO")
                println("DESEA VOLVER AL MENU PRINCIPAL?? (SI/NO)")
                menu = wali.nextLine()
                if ((menu == "si") || (menu == "SI")) {
                    println("MENU")
                } else {
                    println("GRACIAS POR VISITAR LA PAGINA DE KFC")
                }
            }
        }
    }
     fun /*@@xugpiu@@*/metodopago_yape() {
         var yape: /*@@pzqpuj@@*/kotlin.String?
         var confirmar: /*@@hfrdxu@@*/kotlin.String?
         var volver: /*@@avimpe@@*/kotlin.String?
         var volverr: /*@@oyxtdo@@*/kotlin.String?
         var menu: /*@@dplcjk@@*/kotlin.String?
         var yapee: /*@@ezhkkp@@*/java.util.Scanner? = java.util.Scanner(java.lang.System.`in`)
        do  {
            println("Ingrese su número de teléfono asociado a Yape para efectuar su pedido")
            yape = yapee.nextLine().trim({it <= ' '})
            if (yape.length != 9 || !yape.matches("[9]\\d{8}".toRegex())) {
                println("Número de Yape inválido. Por favor, ingrese un número de 9 dígitos que comience con 9")
            }
        } while (yape.length != 9 || !yape.matches("[9]\\d{8}".toRegex()))
        println("DESEA CONFIRMAR SU METODO DE PAGO:  (SI/NO)")
        confirmar = yapee.nextLine()
        if ((confirmar == "si") || (confirmar == "SI")) {
            Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.metodo_de_pago_seleccioando = "YAPE"
            println("PAGO FUE REALIZADO CON EXITO")
            println("Pago realizado con éxito a través de Yape, con el numero de:" + yape)
            println("GRACIAS POR SU COMPRA")
            println("DESEA VOLVER AL MENU PRINCIPAL?? (SI/NO)")
            volver = yapee.nextLine()
            if ((volver == "si") || (volver == "SI")) {
                println("MENU")
            }
        } else if ((confirmar == "no") || (confirmar == "NO")) {
            println("SU PAGO SE HA CANCELADO")
            println("¿DESEA CAMBIAR DE MÉTODO DE PAGO? (SI/NO)")
            volverr = yapee.nextLine()
            if ((volverr == "si") || (volverr == "SI")) {
                Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.metodo_de_pago()
            } else {
                println("SU PEDIDO SE HA CANCELADO")
                println("DESEA VOLVER AL MENU PRINCIPAL?? (SI/NO)")
                menu = yapee.nextLine()
                if ((menu == "si") || (menu == "SI")) {
                    println("MENU")
                } else {
                    println("GRACIAS POR VISITAR LA PAGINA DE KFC")
                }
            }
        }
    }
     fun /*@@ewbmkw@@*/metodopago_contraentrega() {
         var contra: /*@@wsypzd@@*/kotlin.String?
         var respuesta: /*@@smxlef@@*/kotlin.String?
         var menu: /*@@rcbiod@@*/kotlin.String?
         var menus: /*@@slzamm@@*/kotlin.String?
         var entrega: /*@@ezhkkp@@*/java.util.Scanner? = java.util.Scanner(java.lang.System.`in`)
        println("SE REALIZA EL COBRO AL MOMENTO DE RECIBIR SU PEDIDD :) ")
        while (true) {
            println("¿Está de acuerdo con el pago contra entrega? (SI/NO)")
            contra = entrega.nextLine()
            if ((contra == "si") || (contra == "SI")) {
                Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.metodo_de_pago_seleccioando = "Contra entrega"
                println("Gracias por confirmar. Su pedido se procesará con pago contra entrega.")
                println("Su pedido llegara antes que se enfrie ")
                println("  __")
                println(" /|||\\`.__")
                println("(   _    _ _\\")
                println("=`-()--()-'")
                println("     o  o")
                println("--------------------")
                println("DESEA VOLVER AL MENU PRINCIPAL?? (SI/NO)")
                menus = entrega.nextLine()
                if ((menus == "si") || (menus == "SI")) {
                    println("menu")
                } else {
                    println("GRACIAS POR SU COMPRA, ESPARAMOS QUE LO DISFRUTE")
                    println("GRACIAS POR VISITAR LA PAGINA DE KFC")
                }
                break
            } else if ((contra == "no") || (contra == "NO")) {
                println("Ha cancelado la opción de pago contra entrega.")
                println("¿DESEA CAMBIAR DE MÉTODO DE PAGO? (SI/NO)")
                respuesta = entrega.nextLine()
                if ((respuesta == "si") || (respuesta == "SI")) {
                    Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.metodo_de_pago()
                } else if ((respuesta == "no") || (respuesta == "NO")) {
                    println("SU PEDIDO SE A CANCELADO")
                    println("DESEA VOLVER AL MENU PRINCIPAL?? (SI/NO)")
                    menu = entrega.nextLine()
                    if ((menu == "si") || (menu == "SI")) {
                        println("MENU")
                    } else {
                        println("GRACIAS POR VISITAR LA PAGINA DE KFC")
                    }
                }
            }
        }
    }
    var usuarios:/*@@ztavik@@*/kotlin.Array</*@@znfhbo@@*/kotlin.String?>? = Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.registro_de_usuarios.toTypedArray</*@@uvggrt@@*/kotlin.String?>()
     fun /*@@lfjmho@@*/pagina_principal() {
         var wali: /*@@ezhkkp@@*/java.util.Scanner? = java.util.Scanner(java.lang.System.`in`)
         var direccion: /*@@qpmjdq@@*/kotlin.String?
         var op: /*@@pduwfc@@*/kotlin.String?
         var correo_valido: /*@@shaxll@@*/kotlin.String?
         var contraseña_valida: /*@@rtukrs@@*/kotlin.String?
         var registro: /*@@sxvaol@@*/kotlin.String?
         var contraeña: /*@@xolpws@@*/kotlin.String?
         var respuesta: /*@@qfvxyk@@*/kotlin.String?
        println(
        ("⣿⣿⣿⣿⣿⣿⣿⡿⢟⣋⣭⣥⣭⣭⣍⡉⠉⠙⠛⠻⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
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
        "⣿⣿⣿⣿⣿⣿⣿⣿⣷⣦⣤⣄⣀⣀⡀⠄⣀⣀⣹⣦⣽⣾⣿⣿⣿⣿⣿⣿⣿⣿\n"))

         var opcion: /*@@wqtnjj@@*/kotlin.String?
        if (!Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.registrarse) {
            println("┌──────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┐")
            println("│ 1.- MENU                │ 2.- PROMOS                │ 3.- ENCUENTRA TU KFC                │ 4.- EMPIECE A ORDENAR (REGISTRARSE/INICIE SESION)                │")
            println("└──────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┘")
            opcion = wali.nextLine()
            when(opcion){"1" -> {
                    println("MENUS: ")
                    for (MENU:/*@@pcezwc@@*/kotlin.String? in Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menuprincipal)  {
                        println(MENU)
                    }
                    Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.iniciar_sesion()
                }
                "2" -> {
                    println("MENU PROMOCIONES: ")
                    for (fila:/*@@gadukx@@*/kotlin.Array</*@@onlhfc@@*/kotlin.String?>? in Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_promociones)  {
                        java.lang.System.out.printf("%-50s%-50s%n", fila.get(0), fila.get(1))
                    }
                    Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.iniciar_sesion()
                }
                "3" -> {
                    println("INGRESE SU DIRRECCION:")
                    direccion = wali.nextLine().trim({it <= ' '})
                    while (direccion.length <= 8) {
                        println("por favor, ingrese valida")
                        direccion = wali.nextLine().trim({it <= ' '})
                    }
                    println("DIRECCION GUARDADA CON ¡EXITO!: " + direccion)
                    Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.direccion_selecioanda = direccion
                    println("SU KFC MAS SERCANO ESTA UBICADO EN; " + Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.direccion_de_kfc)
                    println("HORACRIO DE ATENCION;")
                    println("LUNES A SABADO DE; 8:00 AM - 9:00 PM")
                    println("LOS DOMINGOS; 9:00 AM - 11:00 PM")
                    println("────────────────────────────────")
                    println("QUIERE EMPEZAR A ORDENAR?:")
                    println("────────────────────────────────")
                    op = wali.nextLine()
                    if (op.equals("si", ignoreCase = true)) {
                        Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.pagina_principal()
                    } else {
                        println("TAMBIEN PUEDE ORDENAR DE MANERA PRESENCIAL EN NUESTRO LOCAL")
                        println("¡LE ESPERAMOS!")
                    }
                }}} else {
             var usuarios: /*@@smkrgs@@*/kotlin.Array</*@@megdid@@*/kotlin.String?>? = Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.registro_de_usuarios.toTypedArray</*@@nkadmk@@*/kotlin.String?>()
            println("┌──────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┐")
            println("│ 1.- MENU                │ 2.- PROMOS                │ 3.- ENCUENTRA TU KFC                │ 4.- CUENTA:" + "(" + usuarios.get(0) + ")" + "     │")
            println("└──────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┘")
            opcion = wali.nextLine()
            when(opcion){"3" -> {
                    println("INGRESE SU DIRRECCION:")
                    direccion = wali.nextLine().trim({it <= ' '})
                    while (direccion.length <= 8) {
                        println("por favor, ingrese valida")
                        direccion = wali.nextLine().trim({it <= ' '})
                    }
                    println("DIRECCION GUARDADA CON ¡EXITO!: " + direccion)
                    Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.direccion_selecioanda = direccion
                    println("SU KFC MAS SERCANO ESTA UBICADO EN; " + Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.direccion_de_kfc)
                    println("HORACRIO DE ATENCION;")
                    println("LUNES A SABADO DE; 8:00 AM - 9:00 PM")
                    println("LOS DOMINGOS; 9:00 AM - 11:00 PM")
                    println("────────────────────────────────")
                    println("QUIERE EMPEZAR A ORDENAR?:")
                    println("────────────────────────────────")
                    op = wali.nextLine()
                    if (op.equals("si", ignoreCase = true)) {
                        Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.pagina_principal()
                    } else {
                        println("TAMBIEN PUEDE ORDENAR DE MANERA PRESENCIAL EN NUESTRO LOCAL")
                        println("¡LE ESPERAMOS!")
                    }
                }
                "4" -> if (Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.registrarse) {
                     var contraseñas: /*@@tmehvw@@*/kotlin.Array</*@@eyoftq@@*/kotlin.String?>? = Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.registro_de_contraseñas.toTypedArray</*@@suikxn@@*/kotlin.String?>()
                    println("INFORMACIÓN DE LA CUENTA:")
                    println("Correo electrónico: " + usuarios.get(0))
                    println("Dirección: " + Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.direccion_selecioanda)
                    println("1.- volver a la pagina principal")
                    println("2.-¿Desea cerrar sesión? (si/no)")
                    op = wali.nextLine()
                    when(op){"1" -> Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.pagina_principal()
                        "2" -> {
                            println("su sesion se ha cerrado!")
                            println("para poder seguir ordenando, vuleva la menu principal")
                            println("deseaa: ...")
                            println("1.- volver al menu principal")
                            println("2.- salir de la pagina")
                            Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.registrarse = false
                            op = wali.nextLine()
                            when(op){"1" -> Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.pagina_principal()
                                "2" -> {
                                    println("GRACIAS POR VISITAR LA PAGINA DE KFC")
                                    println("VUELVA PRONTO")
                                }}}}
                    break
                }

            }}
        opcion = wali.nextLine()
        when(opcion){"3" -> {
                println("INGRESE SU DIRRECCION:")
                direccion = wali.nextLine().trim({it <= ' '})
                while (direccion.length <= 8) {
                    println("por favor, ingrese valida")
                    direccion = wali.nextLine().trim({it <= ' '})
                }
                println("DIRECCION GUARDADA CON ¡EXITO!: " + direccion)
                Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.direccion_selecioanda = direccion
                println("SU KFC MAS SERCANO ESTA UBICADO EN; " + Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.direccion_de_kfc)
                println("HORACRIO DE ATENCION;")
                println("LUNES A SABADO DE; 8:00 AM - 9:00 PM")
                println("LOS DOMINGOS; 9:00 AM - 11:00 PM")
                println("────────────────────────────────")
                println("QUIERE EMPEZAR A ORDENAR?: (si/no)")
                println("────────────────────────────────")
                op = wali.nextLine()
                if (op.equals("si", ignoreCase = true)) {
                    Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.pagina_principal()
                } else {
                    println("TAMBIEN PUEDE ORDENAR DE MANERA PRESENCIAL EN NUESTRO LOCAL")
                    println("¡LE ESPERAMOS!")
                }
            }
            "4" -> {
                println("1.- REGISTRARSE")
                println("2.- INICIAR SESION")
                op = wali.nextLine()
                when(op){"1" -> {
                        if (!Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.registrarse) {
                            println("REGISTRO:")
                            println("registre su correo electronico:")
                            registro = wali.nextLine()
                            while (!registro.contains("@gmail.com")) {
                                println("Correo electrónico inválido, por favor vuelva a intentar :).")
                                registro = wali.nextLine()
                            }
                            Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.registro_de_usuarios.add(registro)
                            println("cree su contraeña:")
                            contraeña = wali.nextLine()
                            Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.registro_de_contraseñas.add(contraeña)
                             var usuarios: /*@@vmtfib@@*/kotlin.Array</*@@wawfjn@@*/kotlin.String?>? = Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.registro_de_usuarios.toTypedArray</*@@omrxou@@*/kotlin.String?>()
                             var contraseñas: /*@@brshzp@@*/kotlin.Array</*@@nrbhja@@*/kotlin.String?>? = Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.registro_de_contraseñas.toTypedArray</*@@ddldzg@@*/kotlin.String?>()
                            println("INICIAR SESIÓN:")
                            do  {
                                println("Ingrese su correo electrónico")
                                correo_valido = wali.nextLine()
                                println("Ingrese su contraseña: ")
                                contraseña_valida = wali.nextLine()
                                 var i: /*@@nexomt@@*/Int = 0
                                while (i < Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.registro_de_usuarios.size) {
                                    if ((correo_valido == Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.registro_de_usuarios.get(i)) && (contraseña_valida == Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.registro_de_contraseñas.get(i))) {
                                        println("Inicio de sesión, ¡EXITOSO!")
                                        Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.registrarse = true
                                        Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.inicio_sesion = true
                                        break
                                    }
                                    i++}
                                if (!Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.inicio_sesion) {
                                    println("Inicio de sesión, ¡FALLIDO!")
                                    println("Correo o contraseña incorrecta.")
                                }
                            } while (!Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.registrarse)
                            println("INGRESE SU DIRRECCION:")
                            direccion = wali.nextLine().trim({it <= ' '})
                            while (direccion.length <= 8) {
                                println("por favor, ingrese valida")
                                direccion = wali.nextLine().trim({it <= ' '})
                            }
                            println("DIRECCION GUARDADA CON ¡EXITO!: " + direccion)
                            Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.direccion_selecioanda = direccion
                            Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_principal()
                            break
                        }
                         var usuarios: /*@@whawxu@@*/kotlin.Array</*@@rxeyui@@*/kotlin.String?>? = Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.registro_de_usuarios.toTypedArray</*@@istjcl@@*/kotlin.String?>()
                         var contraseñas: /*@@tzyxea@@*/kotlin.Array</*@@qvkwnu@@*/kotlin.String?>? = Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.registro_de_contraseñas.toTypedArray</*@@gnovze@@*/kotlin.String?>()
                        println("INICIAR SESIÓN:")
                        println("ingrese su correo:")
                        correo_valido = wali.nextLine()
                        println("ingrese su contraseña:")
                        contraseña_valida = wali.nextLine()
                         var i: /*@@nexomt@@*/Int = 0
                        while (i < usuarios.size) {
                            if ((correo_valido == usuarios.get(i)) && (contraseña_valida == contraseñas.get(i))) {
                                println("Inicio de sesión, ¡EXITOSO!")
                                Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.registrarse = true
                            }
                            i++}
                        Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_principal()
                    }
                    "2" -> {
                         var usuarios: /*@@ltypxk@@*/kotlin.Array</*@@aglena@@*/kotlin.String?>? = Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.registro_de_usuarios.toTypedArray</*@@kwgixd@@*/kotlin.String?>()
                         var contraseñas: /*@@okrlxk@@*/kotlin.Array</*@@yvwiyo@@*/kotlin.String?>? = Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.registro_de_contraseñas.toTypedArray</*@@vwvbqg@@*/kotlin.String?>()
                        println("INICIAR SESIÓN:")
                        println("ingrese su correo:")
                        correo_valido = wali.nextLine()
                        println("ingrese su contraseña:")
                        contraseña_valida = wali.nextLine()
                         var i: /*@@nexomt@@*/Int = 0
                        while (i < usuarios.size) {
                            if ((correo_valido == usuarios.get(i)) && (contraseña_valida == contraseñas.get(i))) {
                                println("Inicio de sesión, ¡EXITOSO!")
                                Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.registrarse = true
                            }
                            i++}
                        Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.menu_principal()
                    }}}}}
     fun /*@@xtoflx@@*/factura(menu_seleccionados:/*@@jbgyib@@*/kotlin.collections.MutableList</*@@vqqeqx@@*/kotlin.String?>?, cantidades_menu_seleccionados:/*@@fohugc@@*/kotlin.collections.MutableList</*@@enrxmo@@*/Int?>?, precios_menu_selecionados:/*@@ngkgvd@@*/kotlin.collections.MutableList</*@@okvera@@*/kotlin.Double?>?, promociones_selecionadas:/*@@vscork@@*/kotlin.collections.MutableList</*@@eeoieh@@*/kotlin.String?>?, cantidades_promociones_seleccionados:/*@@diivsc@@*/kotlin.collections.MutableList</*@@thvnta@@*/Int?>?, precios_promociones_selecionadas:/*@@tfygad@@*/kotlin.collections.MutableList</*@@rcyari@@*/kotlin.Double?>?, metodo_entrega:/*@@hzrsgj@@*/Boolean, metodo_de_pago_seleccioando:/*@@rhwogk@@*/kotlin.String?) {
         var wali: /*@@ezhkkp@@*/java.util.Scanner? = java.util.Scanner(java.lang.System.`in`)
         var volver: /*@@ddwxjg@@*/kotlin.String?
         var subtotal: /*@@fqxkie@@*/kotlin.Double = 0.0
        for (i in menu_seleccionados.indices)  {
            subtotal += precios_menu_selecionados.get(i) * cantidades_menu_seleccionados.get(i)
        }
        for (i in promociones_selecionadas.indices)  {
            subtotal += precios_promociones_selecionadas.get(i) * cantidades_promociones_seleccionados.get(i)
        }
        for (i in Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.complementos_seleccionados.indices)  {
            subtotal += Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_complementos_seleccionados.get(i)
        }
         var igv: /*@@fqxkie@@*/kotlin.Double = subtotal * 0.18
         var delivery: /*@@fqxkie@@*/kotlin.Double = (if (metodo_entrega)10 else 0).toDouble()
         var total_factura: /*@@fqxkie@@*/kotlin.Double = subtotal + igv + delivery
        println("╔══════════════════════════════════════════════════════════════════════════╗")
        println(
        ("           " + "⣿⣿⣿⣿⣿⣿⣿⡿⢟⣋⣭⣥⣭⣭⣍⡉⠉⠙⠛⠻⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
        "            " + "⣿⣿⣿⣿⣿⡏⠁⠠⠶⠛⠻⠿⣿⣿⣿⣿⣷⡄⠄⠄⠄⠄⠉⠻⢿⣿⣿⣿⣿⣿\n" +
        "            " + "⣿⣿⣿⣿⠟⠄⢀⡴⢊⣴⣶⣶⣾⣿⣿⣿⣿⢿⡄⠄⠄⠄⠄⠄⠄⠙⢿⣿⣿⣿\n" +
        "            " + "⣿⣿⡿⠁⠄⠙⡟⠁⣾⣿⣿⣿⣿⣿⣿⣿⣿⣎⠃⠄⠄⠄⠄⠄⠄⠄⠈⢻⣿⣿\n" +
        "            " + "⣿⡟⠄⠄⠄⠄⡇⠰⠟⠛⠛⠿⠿⠟⢋⢉⠍⢩⣠⡀⠄⠄⠄⠄⠄⠄⠄⠄⢹⣿\n" +
        "            " + "⣿⠁⠄⠄⠄⠄⠰⠁⣑⣬⣤⡀⣾⣦⣶⣾⣖⣼⣿⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⢿\n" +
        "            " + "⡏⠄⠄⠄⠄⠄⠄⠄⠨⣿⠟⠰⠻⠿⣣⡙⠿⣿⠋⠄⢀⡀⣀⠄⣀⣀⢀⣀⣀⢸\n" +
        "            " + "⡇⠄⠄⠄⠄⠄⠄⠄⠄⣠⠄⠚⠛⠉⠭⣉⢁⣿⠄⢀⡿⢾⣅⢸⡗⠂⢿⣀⡀⢸\n" +
        "            " + "⡇⠄⠄⠄⠄⠄⠄⠄⠄⠘⢧⣄⠄⣻⣿⣿⣾⠟⣀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢸\n" +
        "            " + "⣿⠄⠄⠄⠄⠄⠄⠄⠄⢠⡀⠄⠄⣿⣿⠟⢁⣴⣿⢸⡄⠄⢦⣤⣤⣤⣤⣄⡀⣼\n" +
        "            " + "⣿⣧⠄⠄⠄⠄⠄⠄⢠⡸⣿⠒⠄⠈⠛⠄⠁⢹⡟⣾⡇⠄⠈⢿⣿⣿⣿⣿⣿⣿\n" +
        "            " + "⣿⣿⣧⣠⣴⣦⠄⠄⢸⣷⡹⣧⣖⡔⠄⠱⣮⣻⣷⣿⣿⠄⠄⠘⣿⣿⣿⣿⣿⣿\n" +
        "            " + "⣿⣿⣿⣿⣿⡇⠄⠄⠸⠿⠿⠚⠛⠁⠂⠄⠉⠉⡅⢰⡆⢰⡄⠄⠘ ⣿⣿⣿⣿\n" +
        "            " + "⣿⣿⣿⣿⣿⣷⣤⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⣷⠘⣧⣠⣾⣿⣿⣿⣿⣿\n" +
        "            " + "⣿⣿⣿⣿⣿⣿⣿⣿⣷⣦⣤⣄⣀⣀⡀⠄⣀⣀⣹⣦⣽⣾⣿⣿⣿⣿⣿⣿⣿⣿"))
        println("                                                              ")
        println("                      KFC JR. San Martin, Juliaca 21103       ")
        println("                                                              ")
        println("                          PEDIDO  :666                        ")
        println("                                                              ")
        println("═══════════════════════════════════════════════════════════════════════════")
        println("                                                              ")
        println("   Recepción: SAIT                                 10/07/2024 ")
        println("   PEDIDO: 666                                                 ")
        println("                                                              ")
        println("──────────────────────────────────────────────────────────────────────────")
        println("   Método de entrega: " + /*~~axywtq~~*/(if (metodo_entrega)"Delivery" else "Recojo en tienda"))
        println("──────────────────────────────────────────────────────────────────────────")
        println("                                                              ")
        println("   Comunicado                                                  ")
        println("   Recuerda guardar la factura para la entrega/recoger su pedido :)")
        println("                                                              ")
        println("──────────────────────────────────────────────────────────────────────────")
        for (i in menu_seleccionados.indices)  {
            println("   Menu: " + menu_seleccionados.get(i))
            println("   Cantidad de producto: " + cantidades_menu_seleccionados.get(i))
            println("   Precio total de menu: S/" + /*~~crvxtk~~*/(precios_menu_selecionados.get(i) * cantidades_menu_seleccionados.get(i)))
            println("──────────────────────────────────────────────────────────────────────────")
        }
        for (i in promociones_selecionadas.indices)  {
            println("   Promoción: " + promociones_selecionadas.get(i))
            println("   Cantidad de producto: " + cantidades_promociones_seleccionados.get(i))
            println("   Precio total de promoción: S/" + /*~~fvevdr~~*/(precios_promociones_selecionadas.get(i) * cantidades_promociones_seleccionados.get(i)))
            println("──────────────────────────────────────────────────────────────────────────")
        }
        for (i in Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.complementos_seleccionados.indices)  {
            println("   Complemento: " + Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.complementos_seleccionados.get(i))
            println("   Precio del complemento: S/" + Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_complementos_seleccionados.get(i))
            println("──────────────────────────────────────────────────────────────────────────")
        }
        println("                                                              ")
        println("   Sub-total:                                     " + subtotal + " soles")
        println("   IGV (18%):                                     " + igv + " soles")
        println("   Delivery:                                      " + delivery + " soles")
        println("                                                              ")
        println("   Total:                                         " + total_factura + " soles")
        println("--------------------------------------------------------------")
        println("   Medio de pago:                                 " + metodo_de_pago_seleccioando + /*~~gjyqej~~*/(if (Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.tipo_de_tarjeta)"VISA" else "MASTERCARD"))
        println("--------------------------------------------------------------")
        println("                                                              ")
        println("╚══════════════════════════════════════════════════════════════════════════╝")
        println("desea  exportar su factura?")
         var exportar: /*@@stlvsq@@*/kotlin.String? = wali.nextLine()
        if (exportar.equals("si", ignoreCase = true))Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.exportar_factura(menu_seleccionados, cantidades_menu_seleccionados, precios_menu_selecionados, promociones_selecionadas, cantidades_promociones_seleccionados, precios_promociones_selecionadas, metodo_entrega, metodo_de_pago_seleccioando)
        println("DESEA VOLVER AL MENU PRINCIPAL?? (SI/NO)")
        volver = wali.nextLine()
        if ((volver == "si") || (volver == "SI")) {
            Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.pagina_principal()
        } else {
            println("Gracias por ser cliente de KFC")
            println("Esperamos que disfrute su compra :) ")
        }
    }
     fun /*@@eayauq@@*/exportar_factura(menu_seleccionados:/*@@kqnniu@@*/kotlin.collections.MutableList</*@@ueotmc@@*/kotlin.String?>?, cantidades_menu_seleccionados:/*@@mzllqp@@*/kotlin.collections.MutableList</*@@qrydkp@@*/Int?>?, precios_menu_selecionados:/*@@yemkpc@@*/kotlin.collections.MutableList</*@@qpgfjw@@*/kotlin.Double?>?, promociones_selecionadas:/*@@oschpt@@*/kotlin.collections.MutableList</*@@loxklu@@*/kotlin.String?>?, cantidades_promociones_seleccionados:/*@@jcsjtv@@*/kotlin.collections.MutableList</*@@uznivi@@*/Int?>?, precios_promociones_selecionadas:/*@@ieyjll@@*/kotlin.collections.MutableList</*@@ffexwi@@*/kotlin.Double?>?, metodo_entrega:/*@@hzrsgj@@*/Boolean, metodo_de_pago_seleccioando:/*@@ngukaa@@*/kotlin.String?): /*@@wnnacn@@*/kotlin.String? {
         var subtotal: /*@@fqxkie@@*/kotlin.Double = 0.0
        for (i in menu_seleccionados.indices)  {
            subtotal += precios_menu_selecionados.get(i) * cantidades_menu_seleccionados.get(i)
        }
        for (i in promociones_selecionadas.indices)  {
            subtotal += precios_promociones_selecionadas.get(i) * cantidades_promociones_seleccionados.get(i)
        }
        for (i in Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.complementos_seleccionados.indices)  {
            subtotal += Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_complementos_seleccionados.get(i)
        }
         var igv: /*@@fqxkie@@*/kotlin.Double = subtotal * 0.18
         var delivery: /*@@fqxkie@@*/kotlin.Double = (if (metodo_entrega)10 else 0).toDouble()
         var total_factura: /*@@fqxkie@@*/kotlin.Double = subtotal + igv + delivery
        try  {
             var archivo: /*@@gaulqm@@*/File? = File("D:\\\\Facturas\\\\factura.txt")
             var escritor: /*@@bezhku@@*/FileWriter? = FileWriter(archivo)
            escritor.write(
            ("           " + "⣿⣿⣿⣿⣿⣿⣿⡿⢟⣋⣭⣥⣭⣭⣍⡉⠉⠙⠛⠻⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
            "            " + "⣿⣿⣿⣿⣿⡏⠁⠠⠶⠛⠻⠿⣿⣿⣿⣿⣷⡄⠄⠄⠄⠄⠉⠻⢿⣿⣿⣿⣿⣿\n" +
            "            " + "⣿⣿⣿⣿⠟⠄⢀⡴⢊⣴⣶⣶⣾⣿⣿⣿⣿⢿⡄⠄⠄⠄⠄⠄⠄⠙⢿⣿⣿⣿\n" +
            "            " + "⣿⣿⡿⠁⠄⠙⡟⠁⣾⣿⣿⣿⣿⣿⣿⣿⣿⣎⠃⠄⠄⠄⠄⠄⠄⠄⠈⢻⣿⣿\n" +
            "            " + "⣿⡟⠄⠄⠄⠄⡇⠰⠟⠛⠛⠿⠿⠟⢋⢉⠍⢩⣠⡀⠄⠄⠄⠄⠄⠄⠄⠄⢹⣿\n" +
            "            " + "⣿⠁⠄⠄⠄⠄⠰⠁⣑⣬⣤⡀⣾⣦⣶⣾⣖⣼⣿⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⢿\n" +
            "            " + "⡏⠄⠄⠄⠄⠄⠄⠄⠨⣿⠟⠰⠻⠿⣣⡙⠿⣿⠋⠄⢀⡀⣀⠄⣀⣀⢀⣀⣀⢸\n" +
            "            " + "⡇⠄⠄⠄⠄⠄⠄⠄⠄⣠⠄⠚⠛⠉⠭⣉⢁⣿⠄⢀⡿⢾⣅⢸⡗⠂⢿⣀⡀⢸\n" +
            "            " + "⡇⠄⠄⠄⠄⠄⠄⠄⠄⠘⢧⣄⠄⣻⣿⣿⣾⠟⣀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢸\n" +
            "            " + "⣿⠄⠄⠄⠄⠄⠄⠄⠄⢠⡀⠄⠄⣿⣿⠟⢁⣴⣿⢸⡄⠄⢦⣤⣤⣤⣤⣄⡀⣼\n" +
            "            " + "⣿⣧⠄⠄⠄⠄⠄⠄⢠⡸⣿⠒⠄⠈⠛⠄⠁⢹⡟⣾⡇⠄⠈⢿⣿⣿⣿⣿⣿⣿\n" +
            "            " + "⣿⣿⣧⣠⣴⣦⠄⠄⢸⣷⡹⣧⣖⡔⠄⠱⣮⣻⣷⣿⣿⠄⠄⠘⣿⣿⣿⣿⣿⣿\n" +
            "            " + "⣿⣿⣿⣿⣿⡇⠄⠄⠸⠿⠿⠚⠛⠁⠂⠄⠉⠉⡅⢰⡆⢰⡄⠄⠘ ⣿⣿⣿⣿\n" +
            "            " + "⣿⣿⣿⣿⣿⣷⣤⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⣷⠘⣧⣠⣾⣿⣿⣿⣿⣿\n" +
            "            " + "⣿⣿⣿⣿⣿⣿⣿⣿⣷⣦⣤⣄⣀⣀⡀⠄⣀⣀⣹⣦⣽⣾⣿⣿⣿⣿⣿⣿⣿⣿\n"))
            escritor.write("╔══════════════════════════════════════════════════════════════════════════╗\n")
            escritor.write("                                                              \n")
            escritor.write("                      KFC JR. San Martin, Juliaca 21103       \n")
            escritor.write("                                                              \n")
            escritor.write("                          PEDIDO  :666                        \n")
            escritor.write("                                                              \n")
            escritor.write("═══════════════════════════════════════════════════════════════════════════\n")
            escritor.write("                                                              \n")
            escritor.write("   Recepción: SAIT" + "                                    " + "10/07/2024 \n")
            escritor.write("   PEDIDO: 666                                                 \n")
            escritor.write("                                                              \n")
            escritor.write("──────────────────────────────────────────────────────────────────────────\n")
            escritor.write("   Método de entrega:" + "                                 " + /*~~fkgccx~~*/(if (metodo_entrega)"Delivery" else "Recojo en tienda") + "\n")
            escritor.write("──────────────────────────────────────────────────────────────────────────\n")
            escritor.write("                                                              \n")
            escritor.write("   Comunicado                                                  \n")
            escritor.write("   Recuerda guardar la factura para la entrega/recoger su pedido :)\n")
            escritor.write("                                                              \n")
            escritor.write("──────────────────────────────────────────────────────────────────────────\n")
            for (i in menu_seleccionados.indices)  {
                 var selecionnn: /*@@cpdygl@@*/kotlin.String? = menu_seleccionados.get(i).split("\\.".toRegex()).dropLastWhile({it.isEmpty()}).toTypedArray().get(1)
                escritor.write("   Menu: " + selecionnn + "\n")
                escritor.write("------------------------------------------------------------------------\n")
                escritor.write("   Cantidad de producto: " + cantidades_menu_seleccionados.get(i) + "\n")
                escritor.write("   Precio total de menu: S/" + /*~~vkutzw~~*/(precios_menu_selecionados.get(i) * cantidades_menu_seleccionados.get(i)) + "\n")
                escritor.write("──────────────────────────────────────────────────────────────────────────\n")
            }
            for (i in promociones_selecionadas.indices)  {
                 var selecionn: /*@@tpjkyr@@*/kotlin.String? = promociones_selecionadas.get(i).split("\\.".toRegex()).dropLastWhile({it.isEmpty()}).toTypedArray().get(1)
                escritor.write("   Promoción: " + selecionn + "\n")
                escritor.write("------------------------------------------------------------------------\n")
                escritor.write("   Cantidad de producto: " + cantidades_promociones_seleccionados.get(i) + "\n")
                escritor.write("   Precio total de promoción: S/" + /*~~pfddsb~~*/(precios_promociones_selecionadas.get(i) * cantidades_promociones_seleccionados.get(i)) + "\n")
                escritor.write("──────────────────────────────────────────────────────────────────────────\n")
            }
            for (i in Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.complementos_seleccionados.indices)  {
                 var selecion: /*@@igfcqn@@*/kotlin.String? = Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.complementos_seleccionados.get(i).split("\\.".toRegex()).dropLastWhile({it.isEmpty()}).toTypedArray().get(1)
                escritor.write("   Complemento: " + selecion + "\n")
                escritor.write("   Precio del complemento: S/" + Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.precios_complementos_seleccionados.get(i) + "\n")
                escritor.write("──────────────────────────────────────────────────────────────────────────\n")
            }
            escritor.write("                                                              \n")
            escritor.write("   Sub-total:    " + "                                     " + subtotal + " soles\n")
            escritor.write("   IGV (18%):    " + "                                     " + igv + " soles\n")
            escritor.write("   Delivery:     " + "                                     " + delivery + " soles\n")
            escritor.write("                                                              \n")
            escritor.write("   Total:        " + "                                     " + total_factura + " soles\n")
            escritor.write("------------------------------------------------------------------------\n")
            escritor.write("   Medio de pago:" + "                                     " + metodo_de_pago_seleccioando + "\n")
            escritor.write("------------------------------------------------------------------------\n")
            escritor.write("                                                              \n")
            escritor.write("╚══════════════════════════════════════════════════════════════════════════╝\n")
            escritor.close()
            println("La factura ha sido exportada exitosamente!")
        }catch (e:/*@@kemzng@@*/IOException) {
            println("Ocurrió un error al exportar la factura.")
            e.printStackTrace()
        }
        return null
    }
    @kotlin.jvm.JvmStatic fun /*@@vwhntn@@*/main(args:/*@@xqgxnp@@*/kotlin.Array</*@@glioen@@*/kotlin.String>) {
         var WALI: /*@@szqgvx@@*/Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS? = Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS()
        Proyecto_KFC_ULTIMO_ULTIMO_DE_AQUI_YA_NO_MAS.pagina_principal()
    }
}