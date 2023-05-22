public class ConversaoDeUnidPesoExample {
  public static void main(String args[]) {
    float num = 234f;
    float aux;

    aux = ConversaoDeUnidPeso.KgParaG(num);
    System.out.printf("\nConvertendo %.0fkg para g: %.1f", num, aux);
    System.out.printf("\nConvertendo %.1fg para kg: %.0f", aux, ConversaoDeUnidPeso.gParaKg(aux));

    aux = ConversaoDeUnidPeso.KgParaLibra(num);
    System.out.printf("\n\nConvertendo %.0fkg para libras: %.1f", num, aux);
    System.out.printf("\nConvertendo %.1f libras para kg: %.0f", aux, ConversaoDeUnidPeso.LibraParaKg(aux));

    aux = ConversaoDeUnidPeso.KgParaOnça(num);
    System.out.printf("\n\nConvertendo %.0fkg para onça: %.1f", num, aux);
    System.out.printf("\nConvertendo %.1f onça para kg: %.0f", aux, ConversaoDeUnidPeso.OnçaParaKg(aux));

    aux = ConversaoDeUnidPeso.gParaLibra(num);
    System.out.printf("\n\nConvertendo %.0fg para libras: %.1f", num, aux);
    System.out.printf("\nConvertendo %.1f libras para g: %.0f", aux, ConversaoDeUnidPeso.LibraParaG(aux));

    aux = ConversaoDeUnidPeso.gParaOnça(num);
    System.out.printf("\n\nConvertendo %.0fg para onça: %.1f", num, aux);
    System.out.printf("\nConvertendo %.1f onça para g: %.0f", aux, ConversaoDeUnidPeso.OnçaParaG(aux));

    aux = ConversaoDeUnidPeso.LibraParaOnça(num);
    System.out.printf("\n\nConvertendo %.0f libras para onça: %.1f", num, aux);
    System.out.printf("\nConvertendo %.1f onça para libras: %.0f", aux, ConversaoDeUnidPeso.OnçaParaLibra(aux));
  }
}
