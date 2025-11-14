package br.com.etecia.myapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class PageAdapterBicicleta extends FragmentStateAdapter {
    public PageAdapterBicicleta(@NonNull Fragment fragment) {
        super(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new UrbanaFragment();
            case 1:
                return new SpeedFragment();
            case 2:
                return new GravelFragment();
            case 3:
                return new TrailFragment();
            default:
                return new UrbanaFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
