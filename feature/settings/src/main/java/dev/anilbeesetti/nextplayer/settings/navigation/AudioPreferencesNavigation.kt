package dev.anilbeesetti.nextplayer.settings.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import dev.anilbeesetti.nextplayer.core.ui.designsystem.NavigationAnimations
import dev.anilbeesetti.nextplayer.settings.screens.audio.AudioPreferencesScreen

const val audioPreferencesNavigationRoute = "audio_preferences_route"

fun NavController.navigateToAudioPreferences(navOptions: NavOptions? = null) {
    this.navigate(audioPreferencesNavigationRoute, navOptions)
}

fun NavGraphBuilder.audioPreferencesScreen(onNavigateUp: () -> Unit) {
    composable(
        route = audioPreferencesNavigationRoute,
        enterTransition = { NavigationAnimations.slideEnter },
        popExitTransition = { NavigationAnimations.slideExit },
        popEnterTransition = null
    ) {
        AudioPreferencesScreen(onNavigateUp = onNavigateUp)
    }
}
