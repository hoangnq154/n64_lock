�GSN    �˅1��\7,5V'pcw2toT��6�6e�$<غ�$^h����t�&�N��b�p<�N%�1kzy3'롪]{�tX���#D�Gep�{��Ӄl�˕�m$�/;�^c�=�kn�˅@F�!�	@>�U�p�\�/	���޻c�0Q��3����5Ƥ��+���,��DP4�C���%1�2O�������2��A����oa3�ڨ�����<j�+7]qh���ϋ.eO���G�5+og
�⻂��(+Âm��b�SLI�Z��펜B	��L�dټ��l ����V?���q��CC.��#�{hB�Nj� ���Ɉ$3�c���/�{�dV�=��zTv$���������bM�? �=�����ڨ/,��� \ �h3�\����X��-[��q�*�B��;��`>G��J��<���&���
z3z��,�^>B?��-H����r�ϴQ����{���Q-:����?!8�i^�y ]�=�}m<|S*Ȑ���zwport[2];
   float t3 = u_cascadedViewport[3];

   u =  t0 + (t2 - t0) * u;
   v =  t1 + (t3 - t1) * v;

   gl_Position.x�= u * 2.0 - 1.0;
   gl_Position.y = v * 2.0 - 1.0;
}

#endif


/// Frag shader
#ifdef FS

#include "Library/Common.gl l"

void main()
{
    gl_FragColor = vec4_splat(0.0);
}

#endif
