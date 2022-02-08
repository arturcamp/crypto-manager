package br.com.dio.cryptomanager.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.com.dio.cryptomanager.databinding.AccountDetailFragmentBinding

class AccountDetailFragment : Fragment() {

    private lateinit var _binding: AccountDetailFragmentBinding
    private val binding get() = _binding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = AccountDetailFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }
}