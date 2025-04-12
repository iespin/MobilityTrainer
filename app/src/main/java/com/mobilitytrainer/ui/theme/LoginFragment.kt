package com.mobilitytrainer.ui.theme

class LoginFragment : Fragment(R.layout.fragment_login) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnLogin = view.findViewById<Button>(R.id.btnLogin)
        btnLogin.setOnClickListener {
            // Aquí agregarás la lógica de validación
            findNavController().navigate(R.id.action_loginFragment_to_routineFragment)
        }
    }
}
