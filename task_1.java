@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    boolean expected = true;
    assertEquals("у ля ля, да тут закралась ошибка, будь уверен!", expected, isAdult);

}
