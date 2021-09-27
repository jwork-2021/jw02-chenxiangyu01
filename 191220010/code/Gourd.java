package code;

import code.Line.Position;
import javafx.scene.paint.Color;

public enum Gourd implements Linable {

    
   A1(0,255,255),A2(1,253,254),A3(2,251,253),A4(3,249,252),A5(4,247,251),A6(5,245,250),A7(6,243,249),A8(7,241,248),A9(8,239,247),A10(9,237,246),A11(10,235,245),A12(11,233,244),A13(12,231,243),A14(13,229,242),A15(14,227,241),A16(15,225,240),A17(16,223,239),A18(17,221,238),A19(18,219,237),A20(19,217,236),A21(20,215,235),A22(21,213,234),A23(22,211,233),A24(23,209,232),A25(24,207,231),A26(25,205,230),A27(26,203,229),A28(27,201,228),A29(28,199,227),A30(29,197,226),A31(30,195,225),A32(31,193,224),A33(32,191,223),A34(33,189,222),A35(34,187,221),A36(35,185,220),A37(36,183,219),A38(37,181,218),A39(38,179,217),A40(39,177,216),A41(40,175,215),A42(41,173,214),A43(42,171,213),A44(43,169,212),A45(44,167,211),A46(45,165,210),A47(46,163,209),A48(47,161,208),A49(48,159,207),A50(49,157,206),A51(50,155,205),A52(51,153,204),A53(52,151,203),A54(53,149,202),A55(54,147,201),A56(55,145,200),A57(56,143,199),A58(57,141,198),A59(58,139,197),A60(59,137,196),A61(60,135,195),A62(61,133,194),A63(62,131,193),A64(63,129,192),A65(64,127,191),A66(65,125,190),A67(66,123,189),A68(67,121,188),A69(68,119,187),A70(69,117,186),A71(70,115,185),A72(71,113,184),A73(72,111,183),A74(73,109,182),A75(74,107,181),A76(75,105,180),A77(76,103,179),A78(77,101,178),A79(78,99,177),A80(79,97,176),A81(80,95,175),A82(81,93,174),A83(82,91,173),A84(83,89,172),A85(84,87,171),A86(85,85,170),A87(86,83,169),A88(87,81,168),A89(88,79,167),A90(89,77,166),A91(90,75,165),A92(91,73,164),A93(92,71,163),A94(93,69,162),A95(94,67,161),A96(95,65,160),A97(96,63,159),A98(97,61,158),A99(98,59,157),A100(99,57,156),A101(100,55,155),A102(101,53,154),A103(102,51,153),A104(103,49,152),A105(104,47,151),A106(105,45,150),A107(106,43,149),A108(107,41,148),A109(108,39,147),A110(109,37,146),A111(110,35,145),A112(111,33,144),A113(112,31,143),A114(113,29,142),A115(114,27,141),A116(115,25,140),A117(116,23,139),A118(117,21,138),A119(118,19,137),A120(119,17,136),A121(120,15,135),A122(121,13,134),A123(122,11,133),A124(123,9,132),A125(124,7,131),A126(125,5,130),A127(126,3,129),A128(127,1,128),A129(128,1,127),A130(129,3,126),A131(130,5,125),A132(131,7,124),A133(132,9,123),A134(133,11,122),A135(134,13,121),A136(135,15,120),A137(136,17,119),A138(137,19,118),A139(138,21,117),A140(139,23,116),A141(140,25,115),A142(141,27,114),A143(142,29,113),A144(143,31,112),A145(144,33,111),A146(145,35,110),A147(146,37,109),A148(147,39,108),A149(148,41,107),A150(149,43,106),A151(150,45,105),A152(151,47,104),A153(152,49,103),A154(153,51,102),A155(154,53,101),A156(155,55,100),A157(156,57,99),A158(157,59,98),A159(158,61,97),A160(159,63,96),A161(160,65,95),A162(161,67,94),A163(162,69,93),A164(163,71,92),A165(164,73,91),A166(165,75,90),A167(166,77,89),A168(167,79,88),A169(168,81,87),A170(169,83,86),A171(170,85,85),A172(171,87,84),A173(172,89,83),A174(173,91,82),A175(174,93,81),A176(175,95,80),A177(176,97,79),A178(177,99,78),A179(178,101,77),A180(179,103,76),A181(180,105,75),A182(181,107,74),A183(182,109,73),A184(183,111,72),A185(184,113,71),A186(185,115,70),A187(186,117,69),A188(187,119,68),A189(188,121,67),A190(189,123,66),A191(190,125,65),A192(191,127,64),A193(192,129,63),A194(193,131,62),A195(194,133,61),A196(195,135,60),A197(196,137,59),A198(197,139,58),A199(198,141,57),A200(199,143,56),A201(200,145,55),A202(201,147,54),A203(202,149,53),A204(203,151,52),A205(204,153,51),A206(205,155,50),A207(206,157,49),A208(207,159,48),A209(208,161,47),A210(209,163,46),A211(210,165,45),A212(211,167,44),A213(212,169,43),A214(213,171,42),A215(214,173,41),A216(215,175,40),A217(216,177,39),A218(217,179,38),A219(218,181,37),A220(219,183,36),A221(220,185,35),A222(221,187,34),A223(222,189,33),A224(223,191,32),A225(224,193,31),A226(225,195,30),A227(226,197,29),A228(227,199,28),A229(228,201,27),A230(229,203,26),A231(230,205,25),A232(231,207,24),A233(232,209,23),A234(233,211,22),A235(234,213,21),A236(235,215,20),A237(236,217,19),A238(237,219,18),A239(238,221,17),A240(239,223,16),A241(240,225,15),A242(241,227,14),A243(242,229,13),A244(243,231,12),A245(244,233,11),A246(245,235,10),A247(246,237,9),A248(247,239,8),A249(248,241,7),A250(249,243,6),A251(250,245,5),A252(251,247,4),A253(252,249,3),A254(253,251,2),A255(254,253,1),A256(255,255,0);







    private final int r;
    private final int g;
    private final int b;

    private Position position;

    Gourd(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public static Gourd getGourdByRank(int rank) {

        for (Gourd gourd : Gourd.values()) {
            if (gourd.rank() == rank) {
                return gourd;
            }
        }
        return null;

    }

    public int rank() {
        return this.ordinal() + 1;
    }

    public int rr(){
        return this.r;
    }
    @Override
    public String toString() {
        return "\033[48;2;" + this.r + ";" + this.g + ";" + this.b + ";38;2;0;0;0m    " + this.rank() + "  \033[0m";
    }

    @Override
    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public Position getPosition() {
        return this.position;
    }

    public void swapPosition(Gourd another) {
        Position p = another.position;
        this.position.setLinable(another);
        p.setLinable(this);
    }

    @Override
    public int getValue() {
        return this.rank();
    }

}