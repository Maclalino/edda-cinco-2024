public class ProgramExUm {
    public static void main(String[] args) {
        AlgoritmoBusca alg = new AlgoritmoBusca();
        int[] arr = { 242, 243, 255, 268, 270, 275, 285, 289, 293, 296,
                306, 307, 310, 315, 318, 323, 334, 337, 350, 351,
                355, 359, 361, 369, 373, 376, 379, 383, 387, 390,
                391, 392, 394, 399, 401, 403, 415, 417, 421, 423,
                429, 433, 436, 440, 447, 459, 463, 464, 477, 481,
                483, 484, 486, 487, 490, 495, 496, 499, 500, 501,
                511, 513, 518, 526, 530, 531, 534, 545, 551, 553,
                554, 558, 561, 565, 572, 591, 592, 600, 605, 609,
                613, 616, 623, 624, 625, 626, 632, 643, 645, 647,
                652, 654, 655, 662, 667, 671, 673, 674, 695, 696
        };
        alg.setChave(415);
        int indice = alg.buscaBinaria(arr, alg.getChave());
        alg.imprimirResultado(alg.getChave(), indice);

        alg.setChave(545);
        int indiceDois = alg.buscaBinaria(arr, alg.getChave());
        alg.imprimirResultado(alg.getChave(), indiceDois);

        alg.setChave(390);
        int indiceTres = alg.buscaBinaria(arr, alg.getChave());
        alg.imprimirResultado(alg.getChave(), indiceTres);

        alg.setChave(609);
        int indiceQuatro = alg.buscaBinaria(arr, alg.getChave());
        alg.imprimirResultado(alg.getChave(), indiceQuatro);

        alg.setChave(296);
        int indiceCinco = alg.buscaBinaria(arr, alg.getChave());
        alg.imprimirResultado(alg.getChave(), indiceCinco);

    }
}
