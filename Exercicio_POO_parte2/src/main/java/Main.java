public class Main {
    public static void main(String[] args) {
        testarLoja();
        testarTrilha();
        testarMascaras();
        testarPenteados();
    }

    private static void testarLoja() {
        System.out.println("=== Imagem 1: Loja de roupas ===");
        CamisaSocial camisa = new CamisaSocial("Dorin", "M", 129.90);
        System.out.println(camisa.calcularPrecoComDesconto(10));
        System.out.println(camisa.confereTamanho("M"));
        System.out.println(camisa.gerarEtiqueta());

        CalcaSocial calca = new CalcaSocial("Moderna", "40", 169.90);
        calca.ajustarTamanho("42");
        System.out.println(calca.calcularValorComAjuste(20));
        System.out.println(calca.gerarEtiqueta());
        System.out.println(calca.getTamanho());

        Terno terno = new Terno("Elegance", "G", 699.00);
        System.out.println(terno.calcularPrecoParcelado(3));
        System.out.println(terno.calcularPrecoComDesconto(15));
        System.out.println(terno.gerarEtiqueta());
    }

    private static void testarTrilha() {
        System.out.println("\n=== Imagem 2: Ciclismo na trilha ===");
        BicicletaTrilha bicicleta = new BicicletaTrilha("Trail Pro", 29, 5);
        System.out.println(bicicleta.trocarMarcha(7));
        System.out.println(bicicleta.frear());
        System.out.println(bicicleta.exibirDados());

        Ciclista ciclista = new Ciclista("Marina", 24, "intermediario");
        System.out.println(ciclista.pedalar(8.5));
        System.out.println(ciclista.avaliarExperiencia());
        System.out.println(ciclista.exibirFicha());

        Trilha trilha = new Trilha("Caminho Verde", 12.0, "media");
        System.out.println(trilha.calcularTempoEstimado(6.0));
        System.out.println(trilha.exigeExperiencia());
        System.out.println(trilha.exibirResumo());
    }

    private static void testarMascaras() {
        System.out.println("\n=== Imagem 3: Mascaras ===");
        MascaraMadeira madeira = new MascaraMadeira("Africa Ocidental", "mogno", 32.0);
        System.out.println(madeira.calcularAlturaEmMetros());
        System.out.println(madeira.descreverMaterial());
        System.out.println(madeira.mostrarFicha());

        MascaraPintada pintada = new MascaraPintada("vermelho", "geometrico", 180.00);
        pintada.alterarCor("ocre");
        System.out.println(pintada.aplicarDesconto(12));
        System.out.println(pintada.mostrarFicha());

        MascaraCerimonial cerimonial = new MascaraCerimonial("Peca 03", "cerimonial", "regular");
        cerimonial.atualizarConservacao("boa");
        System.out.println(cerimonial.estaBemConservada());
        System.out.println(cerimonial.mostrarFicha());
    }

    private static void testarPenteados() {
        System.out.println("\n=== Imagem 4: Penteados de anime ===");
        PenteadoCurto curto = new PenteadoCurto("preto", "liso", 8.0);
        curto.mudarCor("castanho");
        System.out.println(curto.classificarComprimento());
        System.out.println(curto.descricao());

        PenteadoLongo longo = new PenteadoLongo("prateado", "lateral", 28.0);
        System.out.println(longo.calcularComprimentoFinal(3.5));
        longo.alterarFranja("aberta");
        System.out.println(longo.descricao());

        PenteadoEspetado espetado = new PenteadoEspetado("loiro", 6.5, 4);
        espetado.ajustarTopete(7.0);
        System.out.println(espetado.calcularPontosDeDetalhe());
        System.out.println(espetado.descricao());
    }
}
