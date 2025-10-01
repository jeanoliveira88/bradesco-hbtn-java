import java.util.*;

public class ConsultaPessoas {
    public static TreeMap<String, TreeSet<Pessoa>> obterPessoasAgrupadasPorCargoEmOrdemReversa(List<Pessoa> pessoas) {
        TreeMap<String, TreeSet<Pessoa>> map = new TreeMap<>(Comparator.reverseOrder());
        for (Pessoa p : pessoas) {
            map.computeIfAbsent(p.getCargo(), k -> new TreeSet<>()).add(p);
        }
        return map;
    }
}