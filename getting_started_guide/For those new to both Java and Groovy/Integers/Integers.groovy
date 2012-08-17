/*
  @autor rthoth

  Integers:

  Como a maioria das linguagens de programação, pelo menos todas que eu conheço,
  Groovy tem um conjunto de números inteiros bem interessante!
*/


assert Integer.MAX_VALUE == 2147483647;
assert Integer.MIN_VALUE == -2147483648;

assert Short.MAX_VALUE == 32767;
assert Short.MIN_VALUE == -32768;

assert Long.MAX_VALUE == 9223372036854775807;
assert Long.MIN_VALUE == -9223372036854775808;

assert Byte.MAX_VALUE == 127;
assert Byte.MIN_VALUE == -128;


[1,     2,   8,  10,  16,   32].each { e -> assert e };

[01,   02, 010, 012, 020,  040].each { e -> assert e };

[0x1, 0x2, 0x8, 0xA, 0xF, 0x20].each { assert it };



// Groovy também faz a promoção de tipo
assert (Integer.MAX_VALUE + 1L) == 2147483648;
assert (Integer.MAX_VALUE + 1L).class == 2147483648.class;

assert Character.MAX_RADIX == 36;



// Isso achei bem bizarro, vou ver depois...
assert (3 / 2).class == (1.5).class && (1.5).class == BigDecimal;


v1 = 123456789098765432112345;

assert v1.class == BigInteger;

assert v1 * 10 == 1234567890987654321123450;

assert (v1 / 10) == 12345678909876543211234.5 && (v1.divide(10)).class == BigDecimal;