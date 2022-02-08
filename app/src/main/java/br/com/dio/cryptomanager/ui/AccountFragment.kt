package br.com.dio.cryptomanager.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import br.com.dio.cryptomanager.R
import br.com.dio.cryptomanager.databinding.AccountFragmentBinding

class AccountFragment : Fragment() {
    private lateinit var _binding: AccountFragmentBinding
    private val binding get() = _binding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = AccountFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.accountCardView.setOnClickListener {
            findNavController().navigate(R.id.action_accountFragment_to_accountDetailFragment)
        }
    }
}