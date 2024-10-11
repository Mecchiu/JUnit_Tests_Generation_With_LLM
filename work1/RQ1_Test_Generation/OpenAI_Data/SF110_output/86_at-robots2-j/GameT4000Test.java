// GameTest.java
package net.virtualinfinity.atrobots.game;

import net.virtualinfinity.atrobots.arena.FrameBuilder;
import net.virtualinfinity.atrobots.arena.RoundState;
import net.virtualinfinity.atrobots.arena.SimulationObserver;
import net.virtualinfinity.atrobots.compiler.RobotFactory;
import net.virtualinfinity.atrobots.robot.FinalRobotScore;
import net.virtualinfinity.atrobots.robot.Robot;
import net.virtualinfinity.atrobots.robot.RobotScore;
import net.virtualinfinity.atrobots.robot.RobotScoreKeeper;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Game}.
* It contains ten unit test cases for the {@link Game#stepRound()} method.
*/
class GameTest {

		private static final int TOTAL_ROUNDS = 1;
		
		private static final int MAX_PROCESSOR_SPEED = 5;
		
		private static final int ROUND_NUMBER = 1;
		
		private static final int ENTRANT_ID = 0;
		
		private static final int ENTRANT_ID_2 = 1;
		
		private static final int ENTRANT_ID_3 = 2;
		
		private static final int ENTRANT_ID_4 = 3;
		
		private static final int ENTRANT_ID_5 = 4;
		
		private static final int ENTRANT_ID_6 = 5;
		
		private static final int ENTRANT_ID_7 = 6;
		
		private static final int ENTRANT_ID_8 = 7;
		
		private static final int ENTRANT_ID_9 = 8;
		
		private static final int ENTRANT_ID_10 = 9;
		
		private static final int ENTRANT_ID_11 = 10;
		
		private static final int ENTRANT_ID_12 = 11;
		
		private static final int ENTRANT_ID_13 = 12;
		
		private static final int ENTRANT_ID_14 = 13;
		
		private static final int ENTRANT_ID_15 = 14;
		
		private static final int ENTRANT_ID_16 = 15;
		
		private static final int ENTRANT_ID_17 = 16;
		
		private static final int ENTRANT_ID_18 = 17;
		
		private static final int ENTRANT_ID_19 = 18;
		
		private static final int ENTRANT_ID_20 = 19;
		
		private static final int ENTRANT_ID_21 = 20;
		
		private static final int ENTRANT_ID_22 = 21;
		
		private static final int ENTRANT_ID_23 = 22;
		
		private static final int ENTRANT_ID_24 = 23;
		
		private static final int ENTRANT_ID_25 = 24;
		
		private static final int ENTRANT_ID_26 = 25;
		
		private static final int ENTRANT_ID_27 = 26;
		
		private static final int ENTRANT_ID_28 = 27;
		
		private static final int ENTRANT_ID_29 = 28;
		
		private static final int ENTRANT_ID_30 = 29;
		
		private static final int ENTRANT_ID_31 = 30;
		
		private static final int ENTRANT_ID_32 = 31;
		
		private static final int ENTRANT_ID_33 = 32;
		
		private static final int ENTRANT_ID_34 = 33;
		
		private static final int ENTRANT_ID_35 = 34;
		
		private static final int ENTRANT_ID_36 = 35;
		
		private static final int ENTRANT_ID_37 = 36;
		
		private static final int ENTRANT_ID_38 = 37;
		
		private static final int ENTRANT_ID_39 = 38;
		
		private static final int ENTRANT_ID_40 = 39;
		
		private static final int ENTRANT_ID_41 = 40;
		
		private static final int ENTRANT_ID_42 = 41;
		
		private static final int ENTRANT_ID_43 = 42;
		
		private static final int ENTRANT_ID_44 = 43;
		
		private static final int ENTRANT_ID_45 = 44;
		
		private static final int ENTRANT_ID_46 = 45;
		
		private static final int ENTRANT_ID_47 = 46;
		
		private static final int ENTRANT_ID_48 = 47;
		
		private static final int ENTRANT_ID_49 = 48;
		
		private static final int ENTRANT_ID_50 = 49;
		
		private static final int ENTRANT_ID_51 = 50;
		
		private static final int ENTRANT_ID_52 = 51;
		
		private static final int ENTRANT_ID_53 = 52;
		
		private static final int ENTRANT_ID_54 = 53;
		
		private static final int ENTRANT_ID_55 = 54;
		
		private static final int ENTRANT_ID_56 = 55;
		
		private static final int ENTRANT_ID_57 = 56;
		
		private static final int ENTRANT_ID_58 = 57;
		
		private static final int ENTRANT_ID_59 = 58;
		
		private static final int ENTRANT_ID_60 = 59;
		
		private static final int ENTRANT_ID_61 = 60;
		
		private static final int ENTRANT_ID_62 = 61;
		
		private static final int ENTRANT_ID_63 = 62;
		
		private static final int ENTRANT_ID_64 = 63;
		
		private static final int ENTRANT_ID_65 = 64;
		
		private static final int ENTRANT_ID_66 = 65;
		
		private static final int ENTRANT_ID_67 = 66;
		
		private static final int ENTRANT_ID_68 = 67;
		
		private static final int ENTRANT_ID_69 = 68;
		
		private static final int ENTRANT_ID_70 = 69;
		
		private static final int ENTRANT_ID_71 = 70;
		
		private static final int ENTRANT_ID_72 = 71;
		
		private static final int ENTRANT_ID_73 = 72;
		
		private static final int ENTRANT_ID_74 = 73;
		
		private static final int ENTRANT_ID_75 = 74;
		
		private static final int ENTRANT_ID_76 = 75;
		
		private static final int ENTRANT_ID_77 = 76;
		
		private static final int ENTRANT_ID_78 = 77;
		
		private static final int ENTRANT_ID_79 = 78;
		
		private static final int ENTRANT_ID_80 = 79;
		
		private static final int ENTRANT_ID_81 = 80;
		
		private static final int ENTRANT_ID_82 = 81;
		
		private static final int ENTRANT_ID_83 = 82;
		
		private static final int ENTRANT_ID_84 = 83;
		
		private static final int ENTRANT_ID_85 = 84;
		
		private static final int ENTRANT_ID_86 = 85;
		
		private static final int ENTRANT_ID_87 = 86;
		
		private static final int ENTRANT_ID_88 = 87;
		
		private static final int ENTRANT_ID_89 = 88;
		
		private static final int ENTRANT_ID_90 = 89;
		
		private static final int ENTRANT_ID_91 = 90;
		
		private static final int ENTRANT_ID_92 = 91;
		
		private static final int ENTRANT_ID_93 = 92;
		
		private static final int ENTRANT_ID_94 = 93;
		
		private static final int ENTRANT_ID_95 = 94;
		
		private static final int ENTRANT_ID_96 = 95;
		
		private static final int ENTRANT_ID_97 = 96;
		
		private static final int ENTRANT_ID_98 = 97;
		
		private static final int ENTRANT_ID_99 = 98;
		
		private static final int ENTRANT_ID_100 = 99;
		
		private static final int ENTRANT_ID_101 = 100;
		
		private static final int ENTRANT_ID_102 = 101;
		
		private static final int ENTRANT_ID_103 = 102;
		
		private static final int ENTRANT_ID_104 = 103;
		
		private static final int ENTRANT_ID_105 = 104;
		
		private static final int ENTRANT_ID_106 = 105;
		
		private static final int ENTRANT_ID_107 = 106;
		
		private static final int ENTRANT_ID_108 = 107;
		
		private static final int ENTRANT_ID_109 = 108;
		
		private static final int ENTRANT_ID_110 = 109;
		
		private static final int ENTRANT_ID_111 = 110;
		
		private static final int ENTRANT_ID_112 = 111;
		
		private static final int ENTRANT_ID_113 = 112;
		
		private static final int ENTRANT_ID_114 = 113;
		
		private static final int ENTRANT_ID_115 = 114;
		
		private static final int ENTRANT_ID_116 = 115;
		
		private static final int ENTRANT_ID_117 = 116;
		
		private static final int ENTRANT_ID_118 = 117;
		
		private static final int ENTRANT_ID_119 = 118;
		
		private static final int ENTRANT_ID_120 = 119;
		
		private static final int ENTRANT_ID_121 = 120;
		
		private static final int ENTRANT_ID_122 = 121;
		
		private static final int ENTRANT_ID_123 = 122;
		
		private static final int ENTRANT_ID_124 = 123;
		
		private static final int ENTRANT_ID_125 = 124;
		
		private static final int ENTRANT_ID_126 = 125;
		
		private static final int ENTRANT_ID_127 = 126;
		
		private static final int ENTRANT_ID_128 = 127;
		
		private static final int ENTRANT_ID_129 = 128;
		
		private static final int ENTRANT_ID_130 = 129;
		
		private static final int ENTRANT_ID_131 = 130;
		
		private static final int ENTRANT_ID_132 = 131;
		
		private static final int ENTRANT_ID_133 = 132;
		
		private static final int ENTRANT_ID_134 = 133;
		
		private static final int ENTRANT_ID_135 = 134;
		
		private static final int ENTRANT_ID_136 = 135;
		
		private static final int ENTRANT_ID_137 = 136;
		
		private static final int ENTRANT_ID_138 = 137;
		
		private static final int ENTRANT_ID_139 = 138;
		
		private static final int ENTRANT_ID_140 = 139;
		
		private static final int ENTRANT_ID_141 = 140;
		
		private static final int ENTRANT_ID_142 = 141;
		
		private static final int ENTRANT_ID_143 = 142;
		
		private static final int ENTRANT_ID_144 = 143;
		
		private static final int ENTRANT_ID_145 = 144;
		
		private static final int ENTRANT_ID_146 = 145;
		
		private static final int ENTRANT_ID_147 = 146;
		
		private static final int ENTRANT_ID_148 = 147;
		
		private static final int ENTRANT_ID_149 = 148;
		
		private static final int ENTRANT_ID_150 = 149;
		
		private static final int ENTRANT_ID_151 = 150;
		
		private static final int ENTRANT_ID_152 = 151;
		
		private static final int ENTRANT_ID_153 = 152;
		
		private static final int ENTRANT_ID_154 = 153;
		
		private static final int ENTRANT_ID_155 = 154;
		
		private static final int ENTRANT_ID_156 = 155;
		
		private static final int ENTRANT_ID_157 = 156;
		
		private static final int ENTRANT_ID_158 = 157;
		
		private static final int ENTRANT_ID_159 = 158;
		
		private static final int ENTRANT_ID_160 = 159;
		
		private static final int ENTRANT_ID_161 = 160;
		
		private static final int ENTRANT_ID_162 = 161;
		
		private static final int ENTRANT_ID_163 = 162;
		
		private static final int ENTRANT_ID_164 = 163;
		
		private static final int ENTRANT_ID_165 = 164;
		
		private static final int ENTRANT_ID_166 = 165;
		
		private static final int ENTRANT_ID_167 = 166;
		
		private static final int ENTRANT_ID_168 = 167;
		
		private static final int ENTRANT_ID_169 = 168;
		
		private static final int ENTRANT_ID_170 = 169;
		
		private static final int ENTRANT_ID_171 = 170;
		
		private static final int ENTRANT_ID_172 = 171;
		
		private static final int ENTRANT_ID_173 = 172;
		
		private static final int ENTRANT_ID_174 = 173;
		
		private static final int ENTRANT_ID_175 = 174;
		
		private static final int ENTRANT_ID_176 = 175;
		
		private static final int ENTRANT_ID_177 = 176;
		
		private static final int ENTRANT_ID_178 = 177;
		
		private static final int ENTRANT_ID_179 = 178;
		
		private static final int ENTRANT_ID_180 = 179;
		
		private static final int ENTRANT_ID_181 = 180;
		
		private static final int ENTRANT_ID_182 = 181;
		
		private static final int ENTRANT_ID_183 = 182;
		
		private static final int ENTRANT_ID_184 = 183;
		
		private static final int ENTRANT_ID_185 = 184;
		
		private static final int ENTRANT_ID_186 = 185;
		
		private static final int ENTRANT_ID_187 = 186;
		
		private static final int ENTRANT_ID_188 = 187;
		
		private static final int ENTRANT_ID_189 = 188;
		
		private static final int ENTRANT_ID_190 = 189;
		
		private static final int ENTRANT_ID_191 = 190;
		
		private static final int ENTRANT_ID_192 = 191;
		
		private static final int ENTRANT_ID_193 = 192;
		
		private static final int ENTRANT_ID_194 = 193;
		
		private static final int ENTRANT_ID_195 = 194;
		
		private static final int ENTRANT_ID_196 = 195;
		
		private static final int ENTRANT_ID_197 = 196;
		
		private