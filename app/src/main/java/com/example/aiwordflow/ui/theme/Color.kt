package com.example.aiwordflow.ui.theme

import androidx.compose.ui.graphics.Color

// ============= LIGHT THEME COLORS =============

// Primary Colors (Olive/Brown tones)
val Primary = Color(0xFF695C3F)           // Brown primary
val OnPrimary = Color(0xFFFFFFFF)         // White text on primary
val PrimaryContainer = Color(0xFFB8A674)   // Lighter brown container
val OnPrimaryContainer = Color(0xFF2A2317) // Dark text on primary container

// Secondary Colors (Warm brown tones)
val Secondary = Color(0xFF6F5D42)         // Secondary brown
val OnSecondary = Color(0xFFFFFFFF)       // White text on secondary
val SecondaryContainer = Color(0xFFF4E287) // Light yellow container
val OnSecondaryContainer = Color(0xFF2B2106) // Dark text on secondary container

// Tertiary Colors (Green accent)
val Tertiary = Color(0xFF4A6741)          // Dark green
val OnTertiary = Color(0xFFFFFFFF)        // White text on tertiary
val TertiaryContainer = Color(0xFF6F9065)  // Medium green container
val OnTertiaryContainer = Color(0xFF0C1F0A) // Dark text on tertiary container

// Error Colors
val Error = Color(0xFF8B1538)             // Dark red error
val OnError = Color(0xFFFFFFFF)           // White text on error
val ErrorContainer = Color(0xFFD64570)    // Light red container
val OnErrorContainer = Color(0xFF2D0009)  // Dark text on error container

// Surface Colors (Light theme)
val Surface = Color(0xFFFFFBF7)           // Very light cream surface
val SurfaceDim = Color(0xFFE0DDD6)        // Dimmed surface
val SurfaceBright = Color(0xFFFFFBF7)     // Bright surface
val OnSurface = Color(0xFF1E1C16)         // Dark text on surface
val OnSurfaceVariant = Color(0xFF4A4739)  // Medium text on surface
val SurfaceContainerLowest = Color(0xFFFFFFFF) // Pure white
val SurfaceContainerLow = Color(0xFFF9F6EF)    // Very light cream
val SurfaceContainer = Color(0xFFF3F0E9)       // Light cream
val SurfaceContainerHigh = Color(0xFFEDEAE3)   // Medium cream
val SurfaceContainerHighest = Color(0xFFE8E4DD) // Darker cream

// Inverse Colors (Light theme)
val InverseSurface = Color(0xFF33312A)    // Dark surface for inverse
val InverseOnSurface = Color(0xFFF6F2EA) // Light text on inverse surface
val InversePrimary = Color(0xFFD4C8A5)   // Light primary for dark backgrounds

// Outline Colors
val Outline = Color(0xFF7B7865)           // Medium outline
val OutlineVariant = Color(0xFFCDC7B5)   // Light outline variant

// Additional Colors
val Scrim = Color(0xFF000000)             // Black scrim
val Shadow = Color(0xFF000000)            // Black shadow

// ============= DARK THEME COLORS =============

// Primary Colors (Dark theme)
val DarkPrimary = Color(0xFFD4C8A5)       // Light golden for dark theme
val DarkOnPrimary = Color(0xFF2A2317)     // Dark text on primary
val DarkPrimaryContainer = Color(0xFFB8A674) // Container remains similar
val DarkOnPrimaryContainer = Color(0xFF1A1611) // Very dark text

// Secondary Colors (Dark theme)
val DarkSecondary = Color(0xFFE6D4A8)     // Light cream for dark theme
val DarkOnSecondary = Color(0xFF2B2106)   // Dark text on secondary
val DarkSecondaryContainer = Color(0xFF9A8665) // Medium brown container
val DarkOnSecondaryContainer = Color(0xFF1A1611) // Very dark text

// Tertiary Colors (Dark theme)
val DarkTertiary = Color(0xFF8BC582)      // Light green for dark theme
val DarkOnTertiary = Color(0xFF0C1F0A)    // Dark text on tertiary
val DarkTertiaryContainer = Color(0xFF6F9065) // Medium green container
val DarkOnTertiaryContainer = Color(0xFF051105) // Very dark text

// Error Colors (Dark theme)
val DarkError = Color(0xFFFFB3C1)         // Light pink for dark theme
val DarkOnError = Color(0xFF2D0009)       // Dark text on error
val DarkErrorContainer = Color(0xFFFF5574) // Red container
val DarkOnErrorContainer = Color(0xFF1A0004) // Very dark text

// Surface Colors (Dark theme)
val DarkSurface = Color(0xFF141210)       // Very dark brown surface
val DarkSurfaceDim = Color(0xFF0F0E0C)    // Dimmed dark surface
val DarkSurfaceBright = Color(0xFF3B3830) // Bright dark surface
val DarkOnSurface = Color(0xFFE8E4DD)     // Light text on dark surface
val DarkOnSurfaceVariant = Color(0xFFCDC7B5) // Medium light text
val DarkSurfaceContainerLowest = Color(0xFF0F0D0A) // Darkest surface
val DarkSurfaceContainerLow = Color(0xFF1E1C16)    // Dark surface
val DarkSurfaceContainer = Color(0xFF23211A)       // Medium dark surface
val DarkSurfaceContainerHigh = Color(0xFF2D2B24)   // Lighter dark surface
val DarkSurfaceContainerHighest = Color(0xFF38362E) // Lightest dark surface

// Inverse Colors (Dark theme)
val DarkInverseSurface = Color(0xFFE8E4DD) // Light surface for inverse
val DarkInverseOnSurface = Color(0xFF33312A) // Dark text on inverse
val DarkInversePrimary = Color(0xFF695C3F)   // Dark primary for light backgrounds

// Outline Colors (Dark theme)
val DarkOutline = Color(0xFF97917F)       // Medium light outline
val DarkOutlineVariant = Color(0xFF4A4739) // Dark outline variant

// ============= LEGACY COLORS (for compatibility) =============
val Purple80 = DarkPrimary               // D4C8A5
val PurpleGrey80 = DarkSecondary         // F4E287 -> E6D4A8
val Pink80 = Primary                     // 695C3F

val Purple40 = Color(0xFFD7C66B)         // Keeping your original
val PurpleGrey40 = Color(0xFF6F4F00)     // Keeping your original
val Pink40 = Color(0xFF514429)           // Keeping your original