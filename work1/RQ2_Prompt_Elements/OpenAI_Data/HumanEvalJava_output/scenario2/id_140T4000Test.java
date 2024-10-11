// FixSpacesTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FixSpaces}.
* It contains ten unit test cases for the {@link FixSpaces#fixSpaces(String)} method.
*/
class FixSpacesTest {

		@Test
		void testFixSpaces() {
				assertEquals("", FixSpaces.fixSpaces(""));
				assertEquals("a", FixSpaces.fixSpaces("a"));
				assertEquals("a_b", FixSpaces.fixSpaces("a b"));
				assertEquals("a_b_c", FixSpaces.fixSpaces("a b c"));
				assertEquals("a_b_c_d", FixSpaces.fixSpaces("a b c d"));
				assertEquals("a_b_c_d_e", FixSpaces.fixSpaces("a b c d e"));
				assertEquals("a_b_c_d_e_f", FixSpaces.fixSpaces("a b c d e f"));
				assertEquals("a_b_c_d_e_f_g", FixSpaces.fixSpaces("a b c d e f g"));
				assertEquals("a_b_c_d_e_f_g_h", FixSpaces.fixSpaces("a b c d e f g h"));
				assertEquals("a_b_c_d_e_f_g_h_i", FixSpaces.fixSpaces("a b c d e f g h i"));
				assertEquals("a_b_c_d_e_f_g_h_i_j", FixSpaces.fixSpaces("a b c d e f g h i j"));
				assertEquals("a_b_c_d_e_f_g_h_i_j_k", FixSpaces.fixSpaces("a b c d e f g h i j k"));
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l", FixSpaces.fixSpaces("a b c d e f g h i j k l"));
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m", FixSpaces.fixSpaces("a b c d e f g h i j k l m"));
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n", FixSpaces.fixSpaces("a b c d e f g h i j k l m n"));
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n_o", FixSpaces.fixSpaces("a b c d e f g h i j k l m n o"));
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p", FixSpaces.fixSpaces("a b c d e f g h i j k l m n o p"));
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p_q", FixSpaces.fixSpaces("a b c d e f g h i j k l m n o p q"));
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p_q_r", FixSpaces.fixSpaces("a b c d e f g h i j k l m n o p q r"));
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p_q_r_s", FixSpaces.fixSpaces("a b c d e f g h i j k l m n o p q r s"));
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p_q_r_s_t", FixSpaces.fixSpaces("a b c d e f g h i j k l m n o p q r s t"));
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p_q_r_s_t_u", FixSpaces.fixSpaces("a b c d e f g h i j k l m n o p q r s t u"));
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p_q_r_s_t_u_v", FixSpaces.fixSpaces("a b c d e f g h i j k l m n o p q r s t u v"));
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p_q_r_s_t_u_v_w", FixSpaces.fixSpaces("a b c d e f g h i j k l m n o p q r s t u v w"));
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p_q_r_s_t_u_v_w_x", FixSpaces.fixSpaces("a b c d e f g h i j k l m n o p q r s t u v w x"));
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p_q_r_s_t_u_v_w_x_y", FixSpaces.fixSpaces("a b c d e f g h i j k l m n o p q r s t u v w x y"));
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p_q_r_s_t_u_v_w_x_y_z", FixSpaces.fixSpaces("a b c d e f g h i j k l m n o p q r s t u v w x y z"));
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p_q_r_s_t_u_v_w_x_y_z_a", FixSpaces.fixSpaces("a b c d e f g h i j k l m n o p q r s t u v w x y z a"));
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p_q_r_s_t_u_v_w_x_y_z_a_b", FixSpaces.fixSpaces("a b c d e f g h i j k l m n o p q r s t u v w x y z a b"));
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p_q_r_s_t_u_v_w_x_y_z_a_b_c", FixSpaces.fixSpaces("a b c d e f g h i j k l m n o p q r s t u v w x y z a b c"));
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p_q_r_s_t_u_v_w_x_y_z_a_b_c_d", FixSpaces.fixSpaces("a b c d e f g h i j k l m n o p q r s t u v w x y z a b c d"));
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p_q_r_s_t_u_v_w_x_y_z_a_b_c_d_e", FixSpaces.fixSpaces("a b c d e f g h i j k l m n o p q r s t u v w x y z a b c d e"));
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p_q_r_s_t_u_v_w_x_y_z_a_b_c_d_e_f", FixSpaces.fixSpaces("a b c d e f g h i j k l m n o p q r s t u v w x y z a b c d e f"));
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p_q_r_s_t_u_v_w_x_y_z_a_b_c_d_e_f_g", FixSpaces.fixSpaces("a b c d e f g h i j k l m n o p q r s t u v w x y z a b c d e f g"));
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p_q_r_s_t_u_v_w_x_y_z_a_b_c_d_e_f_g_h", FixSpaces.fixSpaces("a b c d e f g h i j k l m n o p q r s t u v w x y z a b c d e f g h"));
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p_q_r_s_t_u_v_w_x_y_z_a_b_c_d_e_f_g_h_i", FixSpaces.fixSpaces("a b c d e f g h i j k l m n o p q r s t u v w x y z a b c d e f g h i"));
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p_q_r_s_t_u_v_w_x_y_z_a_b_c_d_e_f_g_h_i_j", FixSpaces.fixSpaces("a b c d e f g h i j k l m n o p q r s t u v w x y z a b c d e f g h i j"));
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p_q_r_s_t_u_v_w_x_y_z_a_b_c_d_e_f_g_h_i_j_k", FixSpaces.fixSpaces("a b c d e f g h i j k l m n o p q r s t u v w x y z a b c d e f g h i j k"));
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p_q_r_s_t_u_v_w_x_y_z_a_b_c_d_e_f_g_h_i_j_k_l", FixSpaces.fixSpaces("a b c d e f g h i j k l m n o p q r s t u v w x y z a b c d e f g h i j k l"));
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p_q_r_s_t_u_v_w_x_y_z_a_b_c_d_e_f_g_h_i_j_k_l_m", FixSpaces.fixSpaces("a b c d e f g h i j k l m n o p q r s t u v w x y z a b c d e f g h i j k l m"));
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p_q_r_s_t_u_v_w_x_y_z_a_b_c_d_e_f_g_h_i_j_k_l_m_n", FixSpaces.fixSpaces("a b c d e f g h i j k l m n o p q r s t u v w x y z a b c d e f g h i j k l m n"));
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p_q_r_s_t_u_v_w_x_y_z_a_b_c_d_e_f_g_h_i_j_k_l_m_n_o", FixSpaces.fixSpaces("a b c d e f g h i j k l m n o p q r s t u v w x y z a b c d e f g h i j k l m n o"));
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p_q_r_s_t_u_v_w_x_y_z_a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p", FixSpaces.fixSpaces("a b c d e f g h i j k l m n o p q r s t u v w x y z a b c d e f g h i j k l m n o p"));
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p_q_r_s_t_u_v_w_x_y_z_a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p_q", FixSpaces.fixSpaces("a b c d e f g h i j k l m n o p q r s t u v w x y z a b c d e f g h i j k l m n o p q"));
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p_q_r_s_t_u_v_w_x_y_z_a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p_q_r", FixSpaces.fixSpaces("a b c d e f g h i j k l m n o p q r s t u v w x y z a b c d e f g h i j k l m n o p q r"));
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p_q_r_s_t_u_v_w_x_y_z_a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p_q_r_s", FixSpaces.fixSpaces("a b c d e f g h i j k l m n o p q r s t u v w x y z a b c d e f g h i j k l m n o p q r s"));
				