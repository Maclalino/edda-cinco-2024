public class ProgramExDois {
    public static void main(String[] args) {

        AlgoritmoBusca busca = new AlgoritmoBusca();

        int[] arr = { 42, 43, 45, 72, 124, 143, 149, 150, 167, 168,
                178, 186, 188, 192, 212, 221, 228, 230, 233, 238,
                243, 248, 251, 265, 267, 269, 303, 306, 309, 311,
                317, 326, 335, 336, 348, 351, 354, 365, 385, 394,
                396, 404, 411, 413, 415, 420, 424, 428, 432, 441,
                443, 453, 464, 472, 482, 483, 488, 506, 512, 524,
                525, 539, 565, 584, 585, 589, 599, 606, 611, 624,
                626, 628, 634, 644, 662, 688, 691, 700, 703, 711,
                723, 738, 741, 750, 754, 759, 765, 775, 780, 783,
                824, 826, 832, 848, 854, 856, 858, 867, 873, 880
        };

        busca.setChave(824);
        int indiceUmB = busca.buscaBinaria(arr, busca.getChave());
        busca.imprimirResultado(busca.getChave(), indiceUmB);

        busca.setChave(599);
        int indiceDoisB = busca.buscaBinaria(arr, busca.getChave());
        busca.imprimirResultado(busca.getChave(), indiceDoisB);

        busca.setChave(700);
        int indiceTresB = busca.buscaBinaria(arr, busca.getChave());
        busca.imprimirResultado(busca.getChave(), indiceTresB);

        busca.setChave(858);
        int indiceQuatroB = busca.buscaBinaria(arr, busca.getChave());
        busca.imprimirResultado(busca.getChave(), indiceQuatroB);

        busca.setChave(269);
        int indiceCincoB = busca.buscaBinaria(arr, busca.getChave());
        busca.imprimirResultado(busca.getChave(), indiceCincoB);

        busca.setChave(351);
        int indiceSeisB = busca.buscaBinaria(arr, busca.getChave());
        busca.imprimirResultado(busca.getChave(), indiceSeisB);

        busca.setChave(42);
        int indiceSeteB = busca.buscaBinaria(arr, busca.getChave());
        busca.imprimirResultado(busca.getChave(), indiceSeteB);

        busca.setChave(317);
        int indiceOitoB = busca.buscaBinaria(arr, busca.getChave());
        busca.imprimirResultado(busca.getChave(), indiceOitoB);

        busca.setChave(525);
        int indiceNoveB = busca.buscaBinaria(arr, busca.getChave());
        busca.imprimirResultado(busca.getChave(), indiceNoveB);

        busca.setChave(550);
        int indiceDezB = busca.buscaBinaria(arr, busca.getChave());
        busca.imprimirResultado(busca.getChave(), indiceDezB);

        busca.setChave(143);
        int indiceOnzeB = busca.buscaBinaria(arr, busca.getChave());
        busca.imprimirResultado(busca.getChave(), indiceOnzeB);

        busca.setChave(421);
        int indiceDozeB = busca.buscaBinaria(arr, busca.getChave());
        busca.imprimirResultado(busca.getChave(), indiceDozeB);

        busca.setChave(422);
        int indiceTrezeB = busca.buscaBinaria(arr, busca.getChave());
        busca.imprimirResultado(busca.getChave(), indiceTrezeB);

    }

}
